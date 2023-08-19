package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/* Simulação de Thread processando em paralelo do envio de e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//****************************** DIVISÃO DE THREADS
		
		/* Simulação de Thread processando em paralelo do envio de nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
			


		/* Código do sistema do usuário continua o fluxo do trabalho */
		System.out.println("\nCHEGOU AO FIM DO CÓDIGO DE TESTE DE TRHEAD.");
		/*Fluxo do sistema: cadastro de venda, uma emissão de nota fiscal ou algo do tipo...*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");


	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/* CÓDIGO DA ROTINA */
			
			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {
				
				/* Quero executar esse envio com a um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina, por exemplo: envio de nota fiscal.");
				
				try {
					Thread.sleep(4000); /* Dá um tempo */
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				
			}
			/* Fim do código em paralelo */
			
			
		}
	};
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/* CÓDIGO DA ROTINA */
			
			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {
				
				/* Quero executar esse envio com a um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina, por exemplo: envio de e-mail.");
				
				try {
					Thread.sleep(1000); /* Dá um tempo */
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				
			}
			/*Fim do código em paralelo*/
			
		}
	};

}