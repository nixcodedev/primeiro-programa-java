package cursojava;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Condições lógicas com IF e ELSE*/
		/*if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		}else if (media >= 40 && media <= 69) {
			 System.out.println("Aluno em recuperação: " + media);
		 }  
		else {
			System.out.println("Aluno reprovado: " + media);
		}*/
		
		/*Operadores ternários são para micro validações*/
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Reprovado";
		
		System.out.println(saidaResultado);
		
	
	}
}