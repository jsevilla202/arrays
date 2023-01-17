package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int tablaEnteros[] = new int [10];
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<tablaEnteros.length; i++) {
			System.out.print("Inserte un número para almacenar en el array: ");
			numero = sc.nextInt();
			tablaEnteros[i] = numero;
		}
		
		int numPares[] = new int [0];
		int numImpares[] = new int [0];
		int i=0;
		int j =0;
		for(int valor:tablaEnteros) {
			if(valor%2==0) {
				numPares = Arrays.copyOf(numPares, numPares.length+1);
				numPares[i] = valor;
				i++;
			}
			else {
				numImpares = Arrays.copyOf(numImpares, numImpares.length+1);
				numImpares[j] = valor;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));

	}

}
