package cursojava;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição FOR e Continue */

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Blz, encontrei o número: " + numero);
				continue;
			}
		}

	}
}
