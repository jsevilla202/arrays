package ejercicios2;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		int tabla1[] = new int[6];
		int tabla2[] = new int[6];
		int contador = 0;
		
		for(int i=0; i<tabla1.length; i++) {
			tabla1[i] = (int) (Math.random()*50);
			tabla2[i] = (int) (Math.random()*50);
		}
		
		Arrays.sort(tabla2);
		
		for(int i: tabla1) {
			for(int j=0; i<tabla2.length; i++) {
				if(i==tabla2[j]) {
					contador++;
				}
			}
		}
		
		System.out.println("Ha tenido un total de "+ contador + " aciertos");
		
		
		
		

	}

}
