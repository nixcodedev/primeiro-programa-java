package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {

		/* Matriz notas com 1 linha e 3 colunas */
		int notas[][] = new int[2][3];

		/* Primeiro elemento */
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		/* Segundo elemento */
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;

		System.out.println(notas);
	}

}