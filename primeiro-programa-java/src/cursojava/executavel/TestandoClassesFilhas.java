package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Nixon - JDev Treinamento");
		aluno.setNomeEscola("JDev Treinamento");

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("0806080692");
		diretor.setNome("Alex Egídio");

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adrministração");
		secretario.setNumeroCpf("885.835.004-89");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
