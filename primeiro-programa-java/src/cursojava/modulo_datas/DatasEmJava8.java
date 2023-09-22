package cursojava.modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava8 {

	public static void main(String[] args) throws ParseException{

		LocalDate dataAntiga = LocalDate.parse("2020-09-05");
		
		LocalDate dataNova = LocalDate.parse("2023-09-22");
		
		System.out.println("Data antiga é maior que a data nova? " + dataAntiga.isAfter(dataNova));
		
		
		System.out.println("Data antiga é antorior a data nova? " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantidade de dias: " + periodo.getDays());
		
		System.out.println("Quantidade de meses: " + periodo.getMonths());
		
		System.out.println("Quantidade de anos: " + periodo.getYears());
		
		System.out.println("Somente meses: " + periodo.toTotalMonths());
		
		System.out.println("Período é de: " + periodo.getYears() + " anos," + " " + periodo.getMonths()
		+ " meses " + "e " + periodo.getDays() + " dias.");
		
		
		
		
	}
	
}