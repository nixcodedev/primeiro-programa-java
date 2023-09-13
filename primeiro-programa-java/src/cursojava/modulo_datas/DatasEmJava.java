package cursojava.modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

	public class DatasEmJava{
		
		public static void main(String[] args) throws ParseException {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataVencimentoBoleto = simpleDateFormat.parse("01/04/2021");
			
			Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
			
			
			//After: Se data 1 é maior que data 2
			// Before: Se data 1 é menor que data 2
			
			if (dataVencimentoBoleto.before(dataAtualHoje)) {
				System.out.println("Boleto não vencido.");
			}else {
				System.out.println("Boleto vencido. URGENTE!!!");
			}
			
		
		}
	
}