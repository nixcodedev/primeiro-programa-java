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

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Digite o número do RG.");
		String cpf = JOptionPane.showInputDialog("Digite o RG");
		String mae = JOptionPane.showInputDialog("Qual nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");

		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1? ");
		String note1 = JOptionPane.showInputDialog("Nota 1");

		String note2 = JOptionPane.showInputDialog("Nota 2");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ? ");

		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ? ");
		String note3 = JOptionPane.showInputDialog("Nota 3");

		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ? ");
		String note4 = JOptionPane.showInputDialog("Nota 4");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // Convertendo string em inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setNota2(Double.parseDouble(note2));
		aluno1.setNota3(Double.parseDouble(note3));
		aluno1.setNota4(Double.parseDouble(note4));

		aluno1.setDisciplina1(disciplina1);
		aluno1.setDisciplina2(disciplina2);
		aluno1.setDisciplina3(disciplina3);
		aluno1.setDisciplina4(disciplina4);

		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

	}
}
