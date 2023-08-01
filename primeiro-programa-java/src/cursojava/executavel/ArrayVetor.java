package cursojava.executavel;

public class ArrayVetor {
	
	/*Método Main é utilizado para executar o código*/
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados ne objetos também*/
		
		/*Array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[5];
		
		/*Atribuir valores nas posições do array*/
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		
		
		
		for (int pos = 0; pos < 5; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
			
		}
	}

}
