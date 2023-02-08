package cursojava;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição FOR com Break (Parada) */

		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3) {
				System.out.println("Blz, encontrei o número 3.");
				System.out.println("Estou parando de executar...");
				break;
			}
		}

	}
}
