import java.util.Scanner;
public class Questao1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int A;
System.out.println(" Valor de a:");
A = input.nextInt();
while (A == 0) {
System.out.println("O a tem que ser diferente de 0.");
System.out.println(" Valor de a:");
A = input.nextInt();
}
System.out.println(" Valor de b: ");
    double B = input.nextInt();
    System.out.println(" Valor de c: ");
    double C = input.nextInt();
      double delta = ((B*B) - 4*A*C);
      if (delta >= 0){
      double r1 = (-B + Math.sqrt(delta) ) / 2*A;
      double r2 = (-B - Math.sqrt(delta) ) / 2*A;
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
      }if (delta < 0){
            System.out.println("Não há soluções reais");
        }
      }
}
