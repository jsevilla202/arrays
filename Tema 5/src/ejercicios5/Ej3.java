package ejercicios5;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int notas[][] = new int [4][5];
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		//Doble bucle for
		for(int alumno = 0; alumno < notas.length; alumno++) {
			//Alumnos de 1 a X
			System.out.println("ALUMNO " + (alumno+1));
			//con notas[0] usamos la longitud de la j
			for(int asignatura = 0; asignatura < notas[0].length; asignatura++) {
				System.out.print("Inserte, del alumno numero " + (alumno+1) + ", la nota de la asignatura " + (asignatura+1) + ": ");
				notas[alumno][asignatura] = sc.nextInt();
			}
			System.out.println();
		}
		sc.close();
		
		for(int i = 0; i < notas.length; i++) {
			//Se inicializa aquí para poder sacarlo en el mismo bucle
			int notasalumno = 0;
			System.out.println(Arrays.toString(notas[i]));
			//Ordenamos las filas
			Arrays.sort(notas[i]);
			System.out.println("ALUMNO "+(i+1));
			//El valor más bajo estará a la izquierda y el más alto a la derecha
			System.out.println("La nota más baja es "+ notas[i][0]);
			System.out.println("La nota más alta es "+ notas[i][notas.length-1]);
			for(int j = 0; j < notas.length; j++) {
				//Se suman todas las notas de la misma fila
				notasalumno = notasalumno + notas[i][j];
			}
			media = notasalumno/notas.length;
			System.out.println("La nota media es "+ media);
			System.out.println();
		}

	}

}
