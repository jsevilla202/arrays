package ejercicios5;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		int num[][] = new int [3][6];
		
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		for(int i = 0; i< num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}

	}

}
