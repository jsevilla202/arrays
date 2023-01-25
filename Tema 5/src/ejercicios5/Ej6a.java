package ejercicios5;

import java.util.Arrays;

public class Ej6a {

	public static void main(String[] args) {
		int tabla[][] = new int [6][10];
		int auxiliar[][] = new int [6][10];
		int auxiliar2[][] = new int [2][6];
		//dar valores a la tabla y establecer el total
		for(int i = 0; i< tabla.length; i++) {
			for(int j = 0; j< tabla[0].length; j++) {
				tabla[i][j] = (int) (Math.random()*1001);
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println();
		
		for(int i = 0; i<tabla.length;i++) {
			for(int j = 0; j< tabla[0].length; j++) {
				 auxiliar[i][j] = tabla[i][j];
			}
			Arrays.sort(auxiliar[i]);
		}
		
		for(int i = 0; i<=1; i++) {
			for(int j = 0, k = 0; j<auxiliar2[0].length;j++, k++) {
				if(i==0) {
				auxiliar2[i][j] = auxiliar[k][0];
				}
				else {
					auxiliar2[i][j] = auxiliar[k][auxiliar[0].length-1];
				}
			}
			Arrays.sort(auxiliar2[i]);
		}
		
		System.out.println("El número mayor es "+auxiliar2[1][auxiliar2[0].length-1]);
		System.out.println("El número menor es "+auxiliar2[0][0]);

	}

}
