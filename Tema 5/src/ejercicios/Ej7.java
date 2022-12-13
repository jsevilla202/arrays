package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int numeros[] = new int[10];

		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Inserte un número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = numeros.length-1; i>=0; i--) {
			System.out.print(numeros[i]+" ");
		}
	}

}
