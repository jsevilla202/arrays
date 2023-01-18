package ejercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int valor;
		int posicion;
		String opcion = "";
		int intopcion = 0;
		int array[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*101);
		}
		
		while(intopcion!=3) {
			System.out.println("a. Mostrar valores\nb. Eliminar valores\nc. Salir");
			System.out.print("¿Qué acción desea realizar? ");
			opcion = sc.next();
			opcion.toLowerCase();
			
			if(opcion.equals("a")) {
				intopcion = 1;
			}
			else if(opcion.equals("b")){
				intopcion = 2;
			}
			else {
				intopcion = 3;
			}
			switch(intopcion) {
			case 1: System.out.println(Arrays.toString(array)); System.out.println(); break;
			case 2: 
				System.out.print("¿Qué valor desea introducir? ");
				valor = sc.nextInt();
				System.out.print("¿En cual posición lo desea introducir? ");
				posicion = sc.nextInt();
				if(posicion>=10||posicion<0) {
					System.out.println("ERROR: Posición fuera del limite de la tabla, inserte un valor de entre 0 a "+(array.length-1));
				}
				else{
					array[posicion] = valor;
					System.out.println("Valor añadido");
				}
				System.out.println();
				break;
			case 3: break;
			default: System.out.println("ERROR: Valor no valido"); break;
			}
		}
		
		sc.close();

	}

}
