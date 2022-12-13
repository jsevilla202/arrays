package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int numeros[] = new int[8];
		int numero;
		int par = 0;
		int impar = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Inserte un número: ");
			numero = sc.nextInt();
			numeros[i] = numero;
		}
		
		for(int i : numeros) {
			if(i%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		int pares[] = new int [par];
		int impares[] = new int [impar];
		
		par = 0;
		impar = 0;	
		for(int i : numeros) {
			if(i%2==0) {
				pares[par]=i;
				par++;
			}
			if(i%2!=0) {
				impares[impar]=i;
				impar++;
			}
		}
		
		System.out.print("Los pares son ");
		for(int i = 0; i<pares.length; i++) {
			System.out.print(pares[i] + " ");
		}
		
		System.out.println();
		System.out.print("Los impares son ");
		for(int i = 0; i<impares.length; i++) {
			System.out.print(impares[i] + " ");
		}
		
		sc.close();
	}

}
