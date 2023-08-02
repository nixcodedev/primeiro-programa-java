package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Método Main é utilizado para executar o código*/
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados ne objetos também*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?" );
		
		/*Array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + pos);
			notas[pos] = Double.valueOf(valor);
			
		}
		
		
		
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
			
		}
	}

}
