package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instância (Criação de Objeto) */
		/*
		 * aluno1 é uma referência para o objeto Aluno (variável que representa o Aluno)
		 */
		Aluno aluno1 = new Aluno(); // Aqui será o aluno João

		aluno1.setNome("Nixon Sena");
		aluno1.setIdade(41);
		aluno1.setDataNascimento("09/11/1981");
		aluno1.setRegistroGeral("090697112-6");
		aluno1.setNumeroCpf("885.004.535-89");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Jonas");
		aluno1.setDataMatricula("01/01/2023");
		aluno1.setNomeEscola("JDev Treinamento");
		aluno1.setSerieMatriculado("3º ano");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("ALUNO 1:");

		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Registro Geral: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai: " + aluno1.getNomePai());
		System.out.println("Idade é: " + aluno1.getDataMatricula());
		System.out.println("Nome da Escola: " + aluno1.getNomeEscola());
		System.out.println("Data de Matrícula: " + aluno1.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: "+ (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());

		System.out.println("\n-------------------------------------------------------");

		/* ========================================================================= */

		Aluno aluno2 = new Aluno(); // Aqui será o aluno Pedro

		aluno2.setNome("Tiago Reale");
		aluno2.setIdade(38);
		aluno2.setDataNascimento("20/10/1984");
		aluno2.setNota1(87.2);
		aluno2.setNota2(90.8);
		aluno2.setNota3(35.99);
		aluno2.setNota4(85.1);

		System.out.println("\nALUNO 2:");
		System.out.println("Nome é: " + aluno2.getNome());
		System.out.println("Idade é: " + aluno2.getIdade());
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Média da nota é: " + aluno2.getMediaNota());

		/* ========================================================================= */

		Aluno aluno3 = new Aluno(); // Aqui será o aluno Alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 50);

	}
}
