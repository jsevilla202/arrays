package ejercicios4;

import java.util.Arrays;

public class Ej2 {
	public static boolean esPrimo(int n) {
		boolean primo = true;
		
		for(int i = 2, k = 2; i<n;i++) {
			//Si el resto del número introducido entre el contador es 0, se le suma 1 a la variable "k"
			if(n%i==0) {
				k++;
				//Si la variable "k" llega a 3, ya no es primo por lo que nombramos la variable "primo" falsa y salimos del bucle con break
				if(k>=3) {
					primo = false;
					break;
				}
			}
	}
		return primo;
	}

	public static void main(String[] args) {
		int array[] = new int [20];
		int array2[] = new int [20];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*101);
		}
		
		int i = 0;
		int j = array.length-1;
		for(int valor:array) {
			if(esPrimo(valor)==true) {
				array2[i] = valor;
				i++;
			}
			else {
				array2[j] = valor;
				j--;
			}
		}
		
		array = Arrays.copyOf(array2, j);
		
		System.out.println(Arrays.toString(array));

	}

}
