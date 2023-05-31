package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		/*
		 * CONDICIONAL PARA VERIFICAR SE O LOGIN E A SENHA SÃO VALIDOS PARA EXECUTAR O
		 * CÓDIGO
		 */
		if (new Secretario().autenticar(login, senha)) {/*Se TRUE acessa, se FALSE não acessa*/

			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * É uma lista que dentro dela tem uma chave que identifica uma sequência de
			 * valores também
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

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
						String disciplinaRemover = JOptionPane.showInputDialog(null,
								"Qual a disciplina, 1, 2, 3 ou 4?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;/* ++ soma + 1 */
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {/* Separei em listas */

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);

				} else

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("\n------------------- LISTA DOS ALUNOS APROVADOS -------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				System.out.println("");
			}

			System.out.println("\n------------------- LISTA DOS ALUNOS REPROVADOS -------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				System.out.println("");
			}

			System.out.println("\n------------------- LISTA DOS ALUNOS EM RECUPERAÇÃO -------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				System.out.println("");
			}

		} else {/*
				 * SE O LOGIN OU SENHA ESTIVEREM ERRADOS, O CÓDIGO NÃO EXECUTA E EXIBE A
				 * MENSAGEM.
				 */
			JOptionPane.showMessageDialog(null, "Acesso não permitido!");
		}

	}

}