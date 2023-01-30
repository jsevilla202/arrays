package ejercicios5;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7b {

	public static void main(String[] args) {
		int A[][];
		int n;
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Qué longitud para el lado de la tabla desea? ");
		n = sc.nextInt();
		sc.close();
		
		if(n <= 1) {
			System.out.println("ERROR: El lado no puede ser igual o inferior a 1");
		}
		else {
			A = new int [n][n];
			
			for(int i = 0; i<A.length; i++) {
				for(int j = 0; j<A.length; j++) {
					A[i][j] = (int) (Math.random()*101);
				}
				System.out.println(Arrays.toString(A[i]));
			}
			System.out.println();
			
			for(int i = 0; i<A.length; i++) {
				for(int j = 1; j<A.length; j++) {
					if(j!=i) {
						valor = A[i][j];
						A[i][j] = A[j][i];
						A[j][i] = valor;
					}
				}
				System.out.println(Arrays.toString(A[i]));
			}
			
			
			
		}

	}

}
