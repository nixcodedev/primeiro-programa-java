package cursojava.classes;

/*Esta é a nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Estes são os atributos do Aluno*/
	public String nome;
	public int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() { /*Cria os dados na memória  - Sendo padrão do Java*/
		
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
		
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
