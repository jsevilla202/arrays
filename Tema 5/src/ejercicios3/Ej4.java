package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numero;
		int tablaEnteros[] = new int [10];
		int tablaEnteros2[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<tablaEnteros.length; i++) {
			System.out.print("Inserte un número para almacenar en el array: ");
			numero = sc.nextInt();
			tablaEnteros[i] = numero;
		}
		sc.close();
		Arrays.sort(tablaEnteros);
		
		
		int j =0;
		for(int i =0; i<tablaEnteros.length; i++) {
			int doble = Arrays.binarySearch(tablaEnteros2, 0, i, tablaEnteros[i]);
			if(doble<0) {
				tablaEnteros2[j] = tablaEnteros[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(tablaEnteros2));
		
		
	}

}
