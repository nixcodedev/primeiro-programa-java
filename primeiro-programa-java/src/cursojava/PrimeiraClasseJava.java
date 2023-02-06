package cursojava;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição While */

		int numero = 0;

		while (numero <= 60) { /* Verifica depois que executa */
			System.out.println("O número atual é: " + numero);
			numero++;
		}

		/*--------------------------------------------------------*/

		int numero2 = 0;
		do { /* primeiro executa e depois verifica */

			System.out.println("O número atual é: " + numero2);
			numero2++;

		} while (numero2 <= 60);

	}
}
