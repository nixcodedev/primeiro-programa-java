package cursojava;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

		/* Conversão de dado String em numero */
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Desejeja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null, "Divisão para as pessoas deu: " + divisao);
		} else {
			System.out.println("Não quis ver o resultado.");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Desejeja ver o RESTO da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resto);
		} else {
			System.out.println("Não quis ver o resultado.");
		}

	}
}
