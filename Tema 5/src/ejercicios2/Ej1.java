package ejercicios2;

import java.util.Scanner;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int N;
		int M;

		Scanner sc = new Scanner(System.in);

		System.out.print("Indique cual quiere que sea el tamaño del array: ");
		N = sc.nextInt();
		int array[] = new int[N];

		System.out.print("Indique cual quiere que sea el número que se repita en el array: ");
		M = sc.nextInt();
		sc.close();

		Arrays.fill(array, M);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
