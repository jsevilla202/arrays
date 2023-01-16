package ejercicios3;

import java.util.Arrays;

public class Ej6 {

	public static void main(String[] args) {
		int array[] = new int [100];
		int array2[] = new int [100];
		
		for(int i = 1; i<array.length+1; i++) {
			array[i-1] = i;
		}
		
		for(int i = array.length-1; i>=0 ; i--) {
			array2[i] = array[array.length-1-i];
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		
		
		
		

	}

}
