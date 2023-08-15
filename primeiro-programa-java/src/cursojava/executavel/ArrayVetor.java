package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };
		double[] notasPrep = { 8.1, 9.7, 8.6, 8.8 };
		double[] notasVerb = { 8.1, 6.7, 8.6, 9.8 };

		// Criação do aluno 1
		Aluno aluno = new Aluno();
		aluno.setNome("Nixon Sena");
		aluno.setNomeEscola("JDev Treinamento");

		// Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Cusro de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Progamação");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);
		
		
		
		// Criação do aluno 2
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Nicholas Sena");
		aluno2.setNomeEscola("CNA English Course");

		// Criação da disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Prepositions");
		disciplina3.setNota(notasPrep);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("To Be Verb");
		disciplina4.setNota(notasVerb);

		aluno2.getDisciplinas().add(disciplina4);
		
		

		// ---------------------------------------------------------------------------------------------

		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("\nNome do aluno é: " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("\nNome da disciplina é: " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número: " + (posnota + 1) + " é igual a: " + d.getNota()[posnota]);

				}

			}

		}

	}

}
