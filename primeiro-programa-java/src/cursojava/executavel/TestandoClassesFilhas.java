package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Nixon - JDev Treinamento");
		aluno.setNomeEscola("JDev Treinamento");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("0806080692");
		diretor.setNome("Alex Egídio");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adrministração");
		secretario.setNumeroCpf("885.835.004-89");
		secretario.setIdade(18);
		secretario.setNome("Henrique");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("O salário do Aluno é = R$ " + aluno.salario());
		System.out.println("O salário do Diretor é = R$ " + diretor.salario());
		System.out.println("O salário do Secretário é = R$ " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " 
		+ pessoa.getNome() + " e o salário é de = " + pessoa.salario());
		
	}

}
