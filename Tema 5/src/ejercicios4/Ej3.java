package ejercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int valor;
		String opcion = "";
		int intopcion = 0;
		int array[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*101);
		}
		
		Arrays.sort(array);
		
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
				System.out.print("¿Qué valor desea eliminar? ");
				valor = sc.nextInt();
				int indice = Arrays.binarySearch(array, valor);
				if(indice>=0) {
					System.arraycopy(array, indice+1, array, indice, array.length - indice - 1);
					array = Arrays.copyOf(array, array.length-1);
					System.out.println("Valor eliminado");
				}
				else {
					System.out.println("ERROR: Valor no encontrado");
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
