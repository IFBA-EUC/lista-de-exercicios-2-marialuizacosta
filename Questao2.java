


import java.io.IOException;
import java.util.Scanner;
public class Questao2
{
	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print(" a1= ");
    double a1 = input.nextDouble();
    System.out.print(" a2= ");
    double a2 = input.nextDouble();
    System.out.print(" b1= ");
    double b1 = input.nextDouble();
     System.out.print(" b2= ");
    double b2 = input.nextDouble();
    System.out.print("c1= ");
    double c1 = input.nextDouble();
    System.out.print("c2= ");
    double c2 = input.nextDouble();
    
      double distanciaAB = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2)+Math.pow(c2-c1,2));
        System.out.println("distância entre A e B é: " + distanciaAB);
      
     }
}
