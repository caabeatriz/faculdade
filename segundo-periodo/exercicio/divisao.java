import java.util.Scanner;
import javax.swing.*;

public class primeiro {
	
	 public static void main(String args[]) {
		 Scanner ler = new Scanner(System.in);

		 int n1, n2;
		 double divisao, potencia;
		 String mensagem, mensagemPotencia = "";
		 
		  n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		  n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número inteiro"));

		  divisao = n1 / n2;
		  mensagem = "Divisão de " +n1 + " e " + n2 + " é: " + divisao;
		  
		  potencia = Math.pow( n1, n2);
		  mensagemPotencia = "Potência de " +n1 + " por " + n2 + " é: " + divisao;
		  
		  JOptionPane.showMessageDialog(null, mensagem);
		  JOptionPane.showMessageDialog(null, mensagemPotencia);
		  
		  System.exit(0);
	 }
}
