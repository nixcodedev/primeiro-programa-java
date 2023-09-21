package cursojava.modulo_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		Instant inicio = Instant.now();

		Thread.sleep(2000); /*POde ser um processo com um tempo qualquer que não conhecemos, por isso a pausa de 2s*/

		Instant ifinal = Instant.now();

		Duration duracao = Duration.between(inicio, ifinal);

		System.out.println("Duração em nanossegundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em horas: " + duracao.toHours());
		
		System.out.println("Duração em milissegundos: " + duracao.toMillis());
		
		System.out.println("Duração em dias: " + duracao.toDays());

	}

}
