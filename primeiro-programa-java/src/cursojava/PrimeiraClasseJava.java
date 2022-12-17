package cursojava;

public class PrimeiraClasseJava {
	
	/*Main é m método auto executável em Java*/
	public static void main(String[] args) {
	
		/*Concatenação = Unir ou juntar dados*/
		String nome = ("Nixon Sena");
		String cpf = ("488.789.789-85");
		String telefone = ("75 98700-1076");
		String endereco = ("Valença-BA");
		int idade = 41;
		
		String saida = "Meu nome é: " + nome + ", meu CPF é: " +
		cpf + ", Meu contato é: " + telefone +
		", eu moro em: " + endereco + " e a minha idade é: " + idade + ".";
		
		System.out.println(saida);
		
		
	}
	
}