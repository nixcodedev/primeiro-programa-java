package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instância (Criação de Objeto) */
		/*
		 * aluno1 é uma referência para o objeto Aluno (variável que representa o Aluno)
		 */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Digite o número do RG.");
		String cpf = JOptionPane.showInputDialog("Digite o CPF");
		String mae = JOptionPane.showInputDialog("Qual nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");*/

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade)); // Convertendo string em inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);

		}

		/* CONDICIONAL PARA REMOVER DISCIPLINA */
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

		if (escolha == 0) {/* Opção SIM é Zero */

			int continuarRemover = 0;
			int posicao = 1;

			while (continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog(null, "Qual a disciplina, 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;/* ++ soma + 1*/
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}

		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

	}
}
