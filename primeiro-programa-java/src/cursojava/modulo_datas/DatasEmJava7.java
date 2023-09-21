package cursojava.modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) throws ParseException{
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());
		
		
		System.out.println("Dia do Mês: " + localDate.getDayOfMonth());
		
		
		System.out.println("Dia do Ano: " + localDate.getDayOfYear());
		
		
		System.out.println("Mês: " + localDate.getMonthValue());
		
		System.out.println("Ano: " + localDate.getYear());
		

	}

}
