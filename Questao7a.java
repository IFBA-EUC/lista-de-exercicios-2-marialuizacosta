
import java.util.Scanner;
public class Questao7a {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int codigo;
System.out.println("Informe o código: ");
codigo = teclado.nextInt();
while (codigo != -1) {
System.out.println("Código: " + codigo);
System.out.println("Informe o código: ");
codigo = teclado.nextInt();
}
}
}


//////PROGRAMA A//////
