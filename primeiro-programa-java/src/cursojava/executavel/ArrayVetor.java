package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Método Main é utilizado para executar o código*/
	public static void main(String[] args) {
		
		String[] valores = {"Nixon","98.5","Curso Java Web","contato@nixcodedev.com.br","80"};
		
		/*outros tipos de arrays
		 * 
		 *  int[] inteiros = new int[10];
		 *  float[] floats = new float[10];
		 * 
		 * 
		 * 
		 * 
		 * */		
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição: " + pos + " é = " + valores[pos]);
			
		}
	}

}
