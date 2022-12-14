package ejercicios2;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		int tabla[] = new int[55];
		Arrays.fill(tabla, 10);
		
		for(int i = 1; i<=9;i++) {
			int suma = 1;
			for(int j = 1; j<=i; j++) {
				Arrays.fill(tabla, suma,i, i);
			}
		}
		for(int i:tabla) {
			System.out.print(i+" ");
		}

	}

}
