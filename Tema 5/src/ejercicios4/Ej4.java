package ejercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numero;
		int array[] = new int [20];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*11);
		}
		
		System.out.println(Arrays.toString(array));
		
		System.out.print("¿Indique a partir de que valor desea eliminar? ");
		numero = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]>=numero) {
				//Copia el resto del array encima del numero
				System.arraycopy(array, i+1, array, i, array.length-1-i);
				//Elimina el número sobrante
				array = Arrays.copyOf(array, array.length-1);
				//Retrocede a la casilla anterior
				i--;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
