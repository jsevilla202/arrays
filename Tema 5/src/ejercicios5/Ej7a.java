package ejercicios5;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7a {

	public static void main(String[] args) {
		int A[][];
		int B[][];
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Qué longitud para el lado de la tabla desea? ");
		n = sc.nextInt();
		sc.close();
		
		if(n <= 1) {
			System.out.println("ERROR: El lado no puede ser igual o inferior a 1");
		}
		else {
			A = new int [n][n];
			B = new int [n][n];
			
			for(int i = 0; i<A.length; i++) {
				for(int j = 0; j<A.length; j++) {
					A[i][j] = (int) (Math.random()*101);
				}
				System.out.println(Arrays.toString(A[i]));
			}
			System.out.println();
			
			for(int j = 0; j<A.length; j++) {
				for(int i = 0; i<A.length; i++) {
					B[j][i] = A[i][j];
				}
				System.out.println(Arrays.toString(B[j]));
			}
			
			
			
		}
	}

}
