import java.io.IOException;

import java.util.Scanner;
public class Questao6 {
 	
	public static void main(String[] args) throws  IOException {
        Scanner leitor = new Scanner (System.in);
	System.out.println("Digite o número: "); 		       
	int n = leitor.nextInt();
String qden = Integer.toString(n);
System.out.println(" A quantidade de números é:" +qden.length());
  }
}
