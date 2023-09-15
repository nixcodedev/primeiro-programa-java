package cursojava.modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); /* Pega a data atual */

		/* Simular que a data vem do banco de dados */

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));/* Definino uma data qualquer */

		calendar.add(Calendar.DAY_OF_MONTH, -40); /* Data de hoje mais 40 dias */

		
		System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		calendar.add(Calendar.MONTH, 1);

		System.out.println("Somando 1 mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		calendar.add(Calendar.YEAR, 1);

		System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
