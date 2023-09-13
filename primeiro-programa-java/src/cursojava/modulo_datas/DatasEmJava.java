package cursojava.modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

	public class DatasEmJava{
		
		public static void main(String[] args) throws ParseException {
			
			Calendar calendar = Calendar.getInstance();
			
			
			Date date = new Date();
			
			
			System.out.println("Data em milessegundos: " + date.getTime());
			
			System.out.println("Calendar em milissegundos: " + calendar.getTimeInMillis());
			
			
			System.out.println("\nDia do mês: " + date.getDate());
			
			System.out.println("Calendar do mês: " + calendar.get(Calendar.DAY_OF_MONTH));

			
			System.out.println("\nDia da semana: " + date.getDay());
			
			System.out.println("Calendar da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
			
			
			System.out.println("\nHoras do dia: " + date.getHours());
			
			System.out.println("Calendar Horas do dia: " + calendar.get(calendar.HOUR_OF_DAY));
			
			
			System.out.println("\nMinuto da hora: " + date.getMinutes());
			
			System.out.println("Calendar minuto da hora: " + calendar.get(calendar.MINUTE));
			
			
			System.out.println("\nSegundo da hora: " + date.getSeconds());
			
			System.out.println("Calendar do segundo da hora: " + calendar.get(calendar.SECOND));
			
			
			System.out.println("\nAno: " + (date.getYear() + 1900));
			
			System.out.println("Calendar ano: " + calendar.get(calendar.YEAR));
			
			
			
			
			/*---------------------------Simple Date Format---------------------------*/
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
			
			System.out.println("\n\nData atual em formato padrão e String: " + simpleDateFormat.format(date));
			
			System.out.println("Calendar Data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getTime()));
			
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");
			
			System.out.println("\nData em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
			
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18"));
			
			simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Objeto Date: " + simpleDateFormat.parse("05/09/2023"));
		
		}
	
}