import javax.swing.JOptionPane;
 
public class Questao15
{
public static void main (String[]args)
{
String n1, n2, n3;
double nota1, nota2, nota3, media;
 
  n1 = JOptionPane.showInputDialog("Digite a p1");
 
  nota1 = Double.parseDouble(n1);
  
  n2 = JOptionPane.showInputDialog("Digite a p2");
  nota2 = Double.parseDouble(n2);
 
 n3 = JOptionPane.showInputDialog("Digite a p3");
  nota3 = Double.parseDouble(n3);
  
  media = (nota1+nota2+nota3)/3;
  if (media>=6.0)
  {
    JOptionPane.showMessageDialog(null,"A média do aluno é"+media,"Aluno Aprovado",JOptionPane.INFORMATION_MESSAGE);
  } if
 (media < 6.0 & media > 4.0){
   JOptionPane.showMessageDialog(null,"A media do aluno é"+media, "Vai para a verificação suplementar", JOptionPane.WARNING_MESSAGE);
 }
  if (media<4.0)
  {
  JOptionPane.showMessageDialog(null,"A media do aluno é"+media, "Reprovado ", JOptionPane.WARNING_MESSAGE);
  }
 
   System.exit(0);
}
}
