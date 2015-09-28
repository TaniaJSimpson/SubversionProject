package numerosElSeuMinim;

import java.util.Arrays;
import java.util.Scanner;

public class numeroElSeuMinim {
	

	public static void main(String[] args) {
		
		int[] valors= new int[5];
		DemanarValorsUsuari();
		TrobarMinim(valors);
		System.out.println ("El valor més petit és: "+ valors[0]);
		

	}
	
	public static void DemanarValorsUsuari() {
		
		Scanner lector= new Scanner(System.in);
		
		int[] valors= new int [5];
		
		System.out.println ("Escriu 5 valors a l'atzar: ");
	
		valors= lector.nextInt();
	}
	
	public static void TrobarMinim(int[] valors) {
		
		for (int i=0; i<valors.length; i++) {
				
				Arrays.sort(valors);
			}
			
		}
	
		
	}


