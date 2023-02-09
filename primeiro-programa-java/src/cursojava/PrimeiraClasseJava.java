package cursojava;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é o método auto executável em Java */
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* Média para aprovação é 70 */

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média de: " + media + ".");
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de: " + media + ".");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media + ".");
		}

	}
}
