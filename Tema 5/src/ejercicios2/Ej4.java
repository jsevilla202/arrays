package ejercicios2;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		int tabla[] = new int[30];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}

		Arrays.sort(tabla);

		for (int i : tabla) {
			System.out.print(i + " ");
		}

	}

}
