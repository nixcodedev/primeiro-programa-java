package cursojava.modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava9 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for (int mes = 1; mes <=12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de vencimento do boleto: " +
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + mes);
			
			
		}
		

	}

}
