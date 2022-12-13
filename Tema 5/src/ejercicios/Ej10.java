package ejercicios;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		int numeros[] = new int [100];
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<numeros.length; i++) {
			numeros[i] = (int) ((1 + Math.random()*10));
			System.out.println(numeros[i]);
		}
		
		System.out.print("¿Qué número desea buscar? ");
		numero = sc.nextInt();
		sc.close();
		
		for(int i=0; i<numeros.length ;i++) {
			if(numeros[i]/numero==1) {
				System.out.println("Su número está en la posición "+i);
			}
		}

	}

}
