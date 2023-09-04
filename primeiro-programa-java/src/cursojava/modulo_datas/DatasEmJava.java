package cursojava.modulo_datas;

import java.util.Date;

	public class DatasEmJava{
		
		public static void main(String[] args) {
			
			Date date = new Date();
			
			System.out.println("Data em milessegundos: " + date.getTime());
			
			System.out.println("Dia do mês: " + date.getDate());
			
			System.out.println("Dia da semana: " + date.getDay());
			
			System.out.println("Horas do dia: " + date.getHours());
			
			System.out.println("Minuto da hora: " + date.getMinutes());
			
			System.out.println("Segundo da hora: " + date.getSeconds());
			
			System.out.println("Ano: " + (date.getYear() + 1900));
			
			
		
		}
	
}