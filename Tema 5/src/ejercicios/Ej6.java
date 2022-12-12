package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int numeros[] = new int[8];
		int pares[] = new int[8];
		int impares[] = new int[8];		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Inserte un número: ");
			numeros[i] = sc.nextInt();
		}
		for(int i=0; i<numeros.length; i++) {
			int par=0;
			int impar=0;
			if(numeros[i]/2==0) {
				pares[par]=numeros[i];
				par++;
			}
			else {
				impares[impar]=numeros[i];
				impar++;
			}
		}
			System.out.print("Los números pares son: ");
		for(int i = 0; i<pares.length; i++) {
			System.out.print(pares[i]+" ");
		}
			
		sc.close();
	}

}
