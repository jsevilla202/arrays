package ejercicios2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int tabla[] = new int[1000];
		int contador = 0;
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique el número que desea buscar: ");
		N = sc.nextInt();
		sc.close();
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		for(int i: tabla) {
			if(N==i) {
				contador++;
			}
		}
		
		if(contador==0) {
			System.out.println("El número no aparece en la lista");
		}
		else {
			System.out.println("El número si aparece en la lista");
			System.out.println("Aparece un total de "+contador+" veces");
		}
		
		

	}

}
