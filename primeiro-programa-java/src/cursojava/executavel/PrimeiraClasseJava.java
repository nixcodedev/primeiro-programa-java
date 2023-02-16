package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instância (Criação de Objeto) */
		/*aluno1 é uma referência para o objeto Aluno (variável que representa o Aluno)*/
		Aluno aluno1 = new Aluno(); // Aqui será o aluno João
		aluno1.nome = "João";
		aluno1.idade = 41;
		
		System.out.println("Nome do  aluno 1 é: " + aluno1.nome);
		System.out.println("Idade é: " + aluno1.idade);

		Aluno aluno2 = new Aluno(); // Aqui será o aluno Pedro

		Aluno aluno3 = new Aluno(); // Aqui será o aluno Alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 50);

	}
}
