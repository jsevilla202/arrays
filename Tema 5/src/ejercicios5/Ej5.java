package ejercicios5;

import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {
		int tabla[][] = new int [5][6];
		int total = 0;
		//dar valores a la tabla y establecer el total
		for(int i = 0; i< tabla.length-1; i++) {
			int fila = 0;
			for(int j = 0; j< tabla[0].length-1; j++) {
				tabla[i][j] = (int) (Math.random()*(1000-100)+100);
				//Total
				total = total + tabla[i][j];
				//filas
				fila = fila + tabla[i][j];
			}
			//Ubicamos el total en la esquina inferior derecha
			tabla[tabla.length-1][tabla[0].length-1] = total;
			//Ubicamos el total al final de la fila
			tabla[i][tabla.length] = fila;
		}
		
		//Columnas
		for(int j = 0; j<tabla[0].length; j++) {
			total = 0;
			for(int i = 0; i<tabla.length; i++) {
				total = total + tabla[i][j];
			}
			tabla[tabla.length-1][j] = total;
		}
		
		//Imprimir tabla
		for(int i = 0; i<tabla.length;i++) {
		System.out.println(Arrays.toString(tabla[i]));
		}
		
	}

}
