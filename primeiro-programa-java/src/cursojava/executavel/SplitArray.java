package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "nixon, Curso Java, 80, 70, 90, 89";

		String[] ValoresArray = texto.split(",");

		System.out.println("Nome: " + ValoresArray[0]);
		System.out.println("Curso: " + ValoresArray[1]);
		System.out.println("Nota 1: " + ValoresArray[2]);
		System.out.println("Nota 2: " + ValoresArray[3]);
		System.out.println("Nota 3: " + ValoresArray[4]);
		System.out.println("Nota 4: " + ValoresArray[5]);

		/* Convertendo um Array para uma lista */
		List<String> list = Arrays.asList(ValoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
			
		}
		
		/*Convertendo uma lista para Array*/
		String[] conversaoArray = list.toArray(new String[6]); 
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
			
		
		}
	}

}
