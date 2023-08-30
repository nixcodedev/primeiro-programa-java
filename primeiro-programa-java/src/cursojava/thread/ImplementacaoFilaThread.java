package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando...");
		
		
		while(true) {
		
		synchronized (pilha_filha) { /*Bloqueia o acesso a esta lista por outros processos*/
			
			Iterator iteracao = pilha_filha.iterator();
			while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // Pega o objeto atual
				
				/*Exemplo:
				 * Processar 10mil nostas fiscais
				 * Gerar uma lista enorme de PDF
				 * Gerar um envio em massa de email*/
				System.out.println("===================================================");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000); //Dar um tempo para a descarga de memória.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		try {
			Thread.sleep(1000); //Processou toda a lista, dá um tempo para a descarga de memória
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	 }
				
	

}
}
