package ejercicios5;

import java.util.Arrays;

public class Ej6b {

	public static void main(String[] args) {
		int tabla[][] = new int [6][10];
		int auxiliar[][] = new int [6][10];
		int maxi = 0;
		int maxj = 0;
		int mini = 0;
		int minj = 0;
		//dar valores a la tabla y establecer el total
		for(int i = 0; i< tabla.length; i++) {
			for(int j = 0; j< tabla[0].length; j++) {
				tabla[i][j] = (int) (Math.random()*1001);
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println();
		
		//Se copia la tabla en otra para modificarla
		for(int i = 0; i<tabla.length;i++) {
			System.arraycopy(tabla[i], 0, auxiliar[i], 0, tabla[i].length);
			//Y se ordena
			Arrays.sort(auxiliar[i]);
		}
		
		System.out.println();
		
		//Buscamos primero las filas en la ue se ubican ya que se erpite menos veces el bucle
		for(int i = 0; i<auxiliar.length;i++) {
			//Como la columna es estatica, se puede jugar más facil con los valores d la fila
			if(auxiliar[maxi][auxiliar[0].length-1]<auxiliar[i][auxiliar[0].length-1]) {
				maxi = i;
			}
			if(auxiliar[mini][0]>auxiliar[i][0]) {
				mini = i;
			}
		}
		
		//Ya que sabemos la fila, buscamos números que sean iguales al encontrado en la auxiliar dentro de la principal
		for(int j = 0; j <tabla[0].length;j++) {
			//Si se encuentra ya se sabe la posición de la j
			if(auxiliar[maxi][auxiliar[0].length-1] == tabla[maxi][j]) {
				maxj = j;
			}
			if(auxiliar[mini][0] == tabla[mini][j]) {
				minj = j;
			}
		}
		
		//Se muestra la posición +1 para que sea más facil contarlas
		System.out.println("La posición del mayor es " + (maxi+1) + " "+(maxj+1));
		System.out.println("La posición del menor es " + (mini+1) + " "+(minj+1));
		}

	}
