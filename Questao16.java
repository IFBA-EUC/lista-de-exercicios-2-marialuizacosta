import java.io.*;
class Questao16
{

   private int ho,min,seg;

      public Questao16(int horas,int minutos,int segundos)
   {
      ho = horas;
      min = minutos;
      seg= segundos;
   }


   public void incrementar()
   {
     if(++seg>59)
     {
        seg = 0;
        if(++min>59)
        {
          min = 0;
          if(++ho>23)
            ho = 0;
        }
     }
   }

   public void decrementar()
   {
     if(--seg<0)
     {
        seg= 59;
        if(--min<0)
        {
          min = 59;
          if(--ho<0)
            ho = 23;
        }
     }
   }


   public void informar()
   {
      System.out.println("Hora atual: "+ho+":"+min+":"+seg);
   }

   public static void main(String args[])
   {
      Questao16 r1;
      r1 = new Questao16(14,15,10);
      r1.informar();
      r1.incrementar();
      r1.informar();
      for(int c=0;c<20;++c) r1.decrementar();
      r1.informar();
   }
}
public class Tempo {

private int hora;
private int minuto;
private int segundo;

public Tempo() {
setTempo(0, 0, 0);
}
public Tempo(int ho) {
setTempo(hora, 0, 0);
}
public Tempo(int ho , int minuto) {
setTempo(hora, minuto, 0);
}
public Tempo(int hora, int minuto, int segundo) {
setTempo(hora, minuto, segundo);
}

public boolean setTempo(int horas, int minutos, int segundos) {
if((horas>=0 && horas<24) && (minutos>=0 && minutos<60) && (segundos>=0 && segundos<60)) {
this.hora = horas;
this.minuto = minutos;
this.segundo = segundos;
return true;
}else {
this.hora = 0;
this.minuto = 0;
this.segundo = 0;
return false;
}
}


}
