package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int valor;
		int incremento;
		int tabla;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuál es su valor inicial? ");
		valor = sc.nextInt();
		System.out.print("¿Cuál es su incremento? ");
		incremento = sc.nextInt();
		System.out.print("¿Cuantos valores desea crear? ");
		tabla = sc.nextInt();
		
		int tablaEnteros[] = new int [tabla];
		tablaEnteros[0] = valor;
		
		for(int i = 1; i<tablaEnteros.length; i++) {
			tablaEnteros[i] = tablaEnteros[i-1]+incremento;
		}
		
		System.out.println(Arrays.toString(tablaEnteros));
		
		
		
	}

}
