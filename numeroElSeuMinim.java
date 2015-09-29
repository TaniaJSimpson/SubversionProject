package elMinim;

import java.util.Arrays;
import java.util.Scanner;

public class ElMinim {

	public static void main(String[] args) {

		//Instanciem la classe Scanner. I comencem el programa.
		Scanner lector = new Scanner(System.in);
		//Creem una nova variable ssss

		int[] valors = new int[10];
		int i;

		do {
			System.out.println("Entre un numero: ");
			for (i = 0; i < 10; i++) {
				valors[i] = lector.nextInt();
			}
		} while (i < valors.length);

		Arrays.sort(valors);

		System.out.println("El seu mínim és: "+valors[0]+". I el seu màxim: "+valors[9]+".");
	}

}
