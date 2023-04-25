package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {/* Laço de repetição para nome do aluno */

			/* new Aluno() é uma instância (Criação de Objeto) */
			/*
			 * aluno1 é uma referência para o objeto Aluno (variável que representa o Aluno)
			 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Digite o número do RG."); String cpf
			 * = JOptionPane.showInputDialog("Digite o CPF"); String mae =
			 * JOptionPane.showInputDialog("Qual nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Qual a data da matrícula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a série?"); String escola =
			 * JOptionPane.showInputDialog("Qual o nome da escola?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade)); // Convertendo string em inteiro
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
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
					posicao++;/* ++ soma + 1 */
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {/*Separei em listas*/

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);

			} else

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				alunosReprovados.add(aluno);/*REPROVADO - PODERIA SER APENAS O else com alunosReprovados.add(aluno);*/
			}
		}
		
		System.out.println("\n------------------- LISTA DOS ALUNOS APROVADOS -------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
			System.out.print("\n");
		}
		
		System.out.println("\n------------------- LISTA DOS ALUNOS REPROVADOS -------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
			System.out.print("\n");
		}

		System.out.println("\n------------------- LISTA DOS ALUNOS EM RECUPERAÇÃO -------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
			System.out.print("\n");
		}
	
	}
	
}