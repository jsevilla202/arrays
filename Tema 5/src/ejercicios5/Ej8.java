package ejercicios5;

import java.util.Arrays;

public class Ej8 {

	public static void main(String[] args) {
		int tabla[][] = new int [5][5];
		
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla.length; j++) {
				tabla[i][j] = (int) (Math.random()*11);
			}
		}
		
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 1; j<tabla.length; j++) {
				if(j!=i) {
					if(tabla[i][j] != tabla[j][i]) {
						System.out.println("La tabla no es simetrica");
						System.exit(0);
					}
				}
			}
			System.out.println(Arrays.toString(tabla[i]));
		}

	}

}
