package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {
		int num[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			int numero;
			System.out.print("Inserte un número: ");
			numero = sc.nextInt();
			num[i]=numero;
		}
		Arrays.sort(num);
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		sc.close();
	}

}
