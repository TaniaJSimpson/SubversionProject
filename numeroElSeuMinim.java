package elMinim;

import java.util.Arrays;
import java.util.Scanner;

public class ElMinim {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		int[] valors = new int[5];
		int i;

		do {
			System.out.println("Entre un numero: ");
			for (i = 0; i < 5; i++) {
				valors[i] = lector.nextInt();
			}
		} while (i < valors.length);

		Arrays.sort(valors);

		System.out.println(valors[0]);
	}

}
