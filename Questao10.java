import java.io.IOException;
import java.util.Scanner;
public class Questao10 {
public static void main(String[] args) throws IOException {
   Scanner input = new Scanner (System.in);
   System.out.println("DEPOSITO: ");
        double deposito = input.nextDouble();
   System.out.println("TAXA: ");
        double taxa = input.nextDouble();
   System.out.println("DECIMAL: ");       
        double decimal = taxa/100;
      
while( deposito!=0){
double saldo =  Math.pow(decimal ,12)+deposito *12;
saldo++;
System.out.println("Saldo do investimento após 1 ano: "+saldo);  
System.out.println("Deseja processar mais um ano (S/N): ");
String resposta = input.next();
 if (resposta.matches("[S]*")){
   saldo++;
 continue;
 } if (resposta.matches("[N]*")){
   System.out.println("Fim do programa");
   break;
   }
 }
 }
}
