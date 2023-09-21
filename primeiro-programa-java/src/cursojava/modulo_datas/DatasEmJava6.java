package cursojava.modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) throws ParseException {

		/* Nova API de data foi a partir do Java 8 */

		LocalDate dataAtual = LocalDate.now();

		System.out.println("Data Atual " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		
		LocalTime horaAtual = LocalTime.now();

		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();

		System.out.println("Data e Hora Atual: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		
	}

}
 