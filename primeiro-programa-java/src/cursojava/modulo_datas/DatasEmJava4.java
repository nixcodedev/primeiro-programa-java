package cursojava.modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException{
		
		
		long  dias = ChronoUnit.DAYS.between(LocalDate.parse("1958-05-24"), LocalDate.now()); /*Total de dias de uma data até a data atual*/
		
		System.out.println("Possui " + dias + " DIAS entre a faixa de datas.");

	}

}
