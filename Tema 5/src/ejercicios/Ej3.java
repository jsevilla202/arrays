package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		double numeros[] = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<numeros.length; i++) {
			double numero;
			System.out.print("Inserte un número: ");
			numero = sc.nextDouble();
			numeros[i]=numero;
		}
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		sc.close();

	}

}
