package ejercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	public static  int random(int longitud){
		return (int) (Math.random()*longitud);
	}

	public static void main(String[] args) {
		int numfav = -1;
		int numsfav[] = new int [0];
		int i = 0;
		int j = 0;
		int media = 0;
		int fav1 = 0;
		int fav2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(numfav!=0) {
			System.out.print("Introduzca uno de sus números favoritos, introduzca 0 para parar: ");
			numfav = sc.nextInt();
			if(numfav!=0) {
			numsfav = Arrays.copyOf(numsfav, numsfav.length+1);
			numsfav[i] = numfav;
			i++;
			}
		}
		sc.close();
		
		Arrays.sort(numsfav);
		
		while(numsfav.length != 1) {
			i = random(numsfav.length-1);
			j = random(numsfav.length-1);
			if(j==i) {
				j = numsfav.length-1-i;
			}
			
			fav1 = numsfav[i];
			fav2 = numsfav[j];
			media = (int) ((fav1+fav2)/2);
			
			System.out.println(Arrays.toString(numsfav));
			System.arraycopy(numsfav, i+1, numsfav, i, numsfav.length-1-i);
			numsfav = Arrays.copyOf(numsfav, numsfav.length-1);
			if(numsfav.length==1) {
				numsfav[0] = media;
			}
			else {
				numsfav[j] = media;
			}
			System.out.println(Arrays.toString(numsfav));
		}

	}

}
