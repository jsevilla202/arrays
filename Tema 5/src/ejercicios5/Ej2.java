package ejercicios5;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		int array[][] = new int [10] [10];
		int valor1 = 1;
		
		for(int i = 0; i < array.length; i++) {
			int valor2 = 1;
			for(int j = 0; j<array.length; j++) {
				array[i][j]=valor1*valor2;
				valor2++;
			}
			valor1++;
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
