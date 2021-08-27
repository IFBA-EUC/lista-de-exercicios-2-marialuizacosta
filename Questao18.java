import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao18 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    double v;
    System.out.printf("Número: ");
    try {
      v = leitor.nextDouble();
      System.out.printf("número por extenso:\n");
      System.out.printf("%s\n", valorPorExtenso(v));
    } catch (InputMismatchException e) {
        System.out.printf("Erro: valor incompativel \n");
    }
  }
  public static String valorPorExtenso(double v) {
    if (v== 0)
       return("zero");

    long inte = (long)Math.abs(v);
    double rest = v - inte;      

    String s = String.valueOf(inte);
    if (s.length() > 15)
       return("Erro: valor superior a 100 milhões.");

    String t = "", diff, vp;
    String cents = String.valueOf((int)Math.round(rest * 100));

    String[] uni = {"", "um", "dois", "três", "quatro", "cinco",
             "seis", "sete", "oito", "nove", "dez", "onze",
             "doze", "treze", "quatorze", "quinze", "dezesseis",
             "dezessete", "dezoito", "dezenove"};
    String[] cen = {"", "cento", "duzentos", "trezentos",
             "quatrocentos", "quinhentos", "seiscentos",
             "setecentos", "oitocentos", "novecentos"};
    String[] deze = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
             "sessenta", "setenta", "oitenta", "noventa"};
    String[] qualificaS = {"", "mil", "milhão"};
    String[] qualificaP = {"", "mil", "milhões"};
    int num, unid, dez, cent, ta, a = 0;
    boolean umReal = false, tem = false;
    while (!s.equals("0")) {
      ta = s.length();
      if (ta > 3) {
         vp = s.substring(ta-3, ta);
         s = s.substring(0, ta-3);
      } 
      else { 
        vp = s;
        s = "0";
      }
      if (!vp.equals("000")) {
         diff = "";
         if (vp.equals("100"))
            diff = "cem";
         else {
           num = Integer.parseInt(vp, 10);  
           cent = num / 100;                  
           dez = (num % 100) / 10;           
           unid = (num % 100) % 10;           
           if (cent != 0)
              diff = cen[cent];
           if ((num % 100) <= 19) {
              if (diff.length() != 0)
                 diff = diff + " e " + uni[num % 100];
              else diff = uni[num % 100];
           }
           else {
              if (diff.length() != 0)
                 diff = diff + " e " + deze[dez];
              else diff = deze[dez];
              if (unid != 0) {
                 if (diff.length() != 0)
                    diff = diff + " e " + uni[unid];
                 else diff = uni[unid];
              }
           }
         }
         if (vp.equals("1") || vp.equals("001")) {
            if (a == 0) 
               umReal = true;
            else diff = diff + " " + qualificaS[a];
         }
         else if (a != 0)
                 diff = diff + " " + qualificaP[a];
         if (t.length() != 0)
            t = diff + ", " + t;
         else t = diff;
      }
      if (((a == 0) || (a == 1)) && t.length() != 0)
         tem = true; 
      a = a + 1; 
    }

    if (t.length() != 0) {
       if (umReal)
          t =t;
       else if (tem)
             t =t;
            else t =t;
    }
    if (!cents.equals("0")) { 
       if (t.length() != 0) 
          t = t;
       if (cents.equals("1"))
          t = t;
       else {
         num = Integer.parseInt(cents, 10);
         if (num <= 19)
            t = t + uni[num];
         else {
           unid = num % 10;  
           dez = num / 10;    
          t = t + deze[dez];
           if (unid != 0)
              t = t + " e " + uni[unid];
         }
         t = t;
       }
    }
    return(t);
  }
}
