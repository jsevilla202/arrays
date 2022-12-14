package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0, j = 0;i<=19;i++) {
			System.out.print("Introduzca un valor: ");
			if(i<=9) {
				tabla1[i] = sc.nextInt();
			}
			else {
				tabla2[j] = sc.nextInt();
				j++;
			}
		}
		
		System.out.println(Arrays.equals(tabla1, tabla2)? "Sus tablas SON iguales":"Sus tablas NO SON iguales");
	}

}
