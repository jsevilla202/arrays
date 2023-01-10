package ejercicios3;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		int tabla[] = new int[20];
		int tabla2[] = new int[20];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		
		Arrays.sort(tabla);
		
		int i = 0;
		int j = tabla.length-1;
		for(int valor:tabla) {
			if(valor%2==0) {
				tabla2[i] = valor;
				i++;
			}
			else {
				tabla2[j] = valor;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(tabla2));

	}

}
