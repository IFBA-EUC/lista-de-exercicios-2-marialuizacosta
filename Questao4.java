import java.io.IOException;

import java.util.Scanner;
public class Questao4 {
 	
	public static void main(String[] args) throws  IOException {
  Scanner leitor = new Scanner(System.in); 
  System.out.println("Nome: ") ;
  String nome = leitor.next();
  System.out.println("Preço da uni: ");
  double preço = leitor.nextDouble();
  System.out.println("Quantidade: ");
  double quantidade = leitor.nextDouble();
  if ( quantidade <= 10){
  double valortotal = preço * quantidade;
  System.out.println(" o/a "+ nome+" vai custar: "+valortotal);
  } if  (quantidade > 10  &  quantidade < 21 ){
  double desconto10 = ((preço * quantidade)/100)*90;
  System.out.println("o/a " +nome+" vai custar: "+desconto10);
  }if (quantidade >20  & quantidade < 51){
  double desconto20 = ((preço * quantidade)/100)*80;
  System.out.println("o/a "+nome+" vai custar: "+desconto20);
  } if (quantidade > 50) { 
    double desconto25 = ((preço*quantidade)/100)*75;
    System.out.println("o/a "+nome+" vai custar: "+desconto25);
  }
  }
}
