package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int ranking[] = new int[8];
		int puntuacion;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ranking.length;i++) {
			while(true) {
			System.out.print("¿Qué puntuación ha obtenido? ");
			puntuacion = sc.nextInt();
			if(puntuacion>=900) {
				ranking[i] = puntuacion;
				break;
			}
			else {
				System.out.println("ERROR: La puntuación debe ser mayor a 900");
			}
			}
		}
		Arrays.sort(ranking);
		
		for(int i=ranking.length-1; i>=0; i--) {
			System.out.println(ranking[i]);
		}

	}

}
