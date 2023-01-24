package ejercicios5;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int array[][] = new int [5] [5];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j<array.length; j++) {
				array[i][j]=10*(i+j);
			}
			System.out.println(Arrays.toString(array[i]));
		}
		
		

	}

}
