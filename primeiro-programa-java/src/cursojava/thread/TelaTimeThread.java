package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	

	public TelaTimeThread() { /*Executa o que tiver dentro no momento da abertura ou execução*/
		
		setTitle("Minha tela de time com thread"); //titulo da janela
		setSize(new Dimension(240,240)); //tamanho da janela
		setLocationRelativeTo(null); //posicionamento da janela
		setResizable(false); // travar tamanho da janela
		/*Primeira parte concluída*/
		
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /* Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		
		/*Sempre será o último comando*/
		setVisible(true); /* Torna a tela visível para o usuário*/
		
	}

}
