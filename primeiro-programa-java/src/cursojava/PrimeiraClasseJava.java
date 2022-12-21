package cursojava;

public class PrimeiraClasseJava {

	/* Main é m método auto executável em Java */
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Alex";

		if (mediaAluno >= 70 && nome.equals("Nixon")) {
			System.out.println("Parabéns, você está aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Aluno reprovado.");

		} else {
			System.out.println("Aluno não encontrado.");
		}

	}
}