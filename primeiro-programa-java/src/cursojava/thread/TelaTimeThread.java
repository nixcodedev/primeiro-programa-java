package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() { /*Executa o que tiver dentro no momento da abertura ou execução*/
		
		setTitle("Minha tela de time com thread"); //titulo da janela
		setSize(new Dimension(240,240)); //tamanho da janela
		setLocationRelativeTo(null); //posicionamento da janela
		setResizable(false); // travar tamanho da janela
		
		
		/*Sempre será o último comando*/
		setVisible(true); /* Torna a tela visível para o usuário*/
		
	}

}
