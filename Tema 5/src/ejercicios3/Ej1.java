package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int N;
		int array[] = new int [15];
		int array2[] = new int [15];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			System.out.print("Inserte un número para almacenar en el array: ");
			N = sc.nextInt();
			array[i] = N;
		}
		sc.close();

		array2[0] = array[array.length-1];
		System.arraycopy(array, 0, array2, 1, array.length-1);
		System.out.println(Arrays.toString(array2));
		

	}

}
