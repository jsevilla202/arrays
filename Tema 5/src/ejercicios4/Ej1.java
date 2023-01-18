package ejercicios4;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int array[] = new int [20];
		int array2[] = new int [20];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*101);
		}
		
		int i = 0;
		int j = array.length-1;
		for(int valor:array) {
			if(valor%2==0) {
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
