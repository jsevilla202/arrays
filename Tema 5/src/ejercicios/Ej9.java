package ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		double[] temperatura = new double[12];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<meses.length;i++) {
			System.out.print("¿Qué temperatura hizo en "+meses[i] + "? ");
			temperatura[i] = sc.nextDouble();
		}
		sc.close();
		
		for(int i = 0; i<temperatura.length;i++) {
			System.out.print(meses[i] +": ");
			while((int) temperatura[i] !=0) {
				System.out.print("*");
				temperatura[i]--;
			}
			System.out.println();
		}

	}

}
