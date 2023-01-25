package ejercicios5;

import java.util.Arrays;

public class Ej6b {

	public static void main(String[] args) {
		int tabla[][] = new int [6][10];
		int auxiliar[][] = new int [6][10];
		int maxi = 0;
		int maxj = 0;
		int mini = 0;
		int minj = 0;
		//dar valores a la tabla y establecer el total
		for(int i = 0; i< tabla.length; i++) {
			for(int j = 0; j< tabla[0].length; j++) {
				tabla[i][j] = (int) (Math.random()*1001);
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println();
		
		for(int i = 0; i<tabla.length;i++) {
			System.arraycopy(tabla[i], 0, auxiliar[i], 0, tabla[i].length);
			Arrays.sort(auxiliar[i]);
		}
		
		for(int i = 0; i<=1; i++) {
			for(int j = 0; j<auxiliar.length;j++) {
				if(i==0) {
					if(j==0) {
						mini=j;
					}
					else {
						if(auxiliar[j][0]<auxiliar[j-1][0]) {
							mini=j;
						}
					}
				}
				else {
					if(j==0) {
						maxi=j;
					}
					else {
						if(auxiliar[j][auxiliar[0].length-1]>auxiliar[j-1][0]) {
							maxi=j;
						}
					}
				}
			}
		}
		
		for(int i = 0; i<=1; i++) {
			for(int j = 0; j<auxiliar[0].length; j++) {
				if(i==0) {
					if(auxiliar[mini][0]==tabla[mini][j]) {
						minj=j;
					}
				}
				else {
						if(auxiliar[maxi][auxiliar.length-1]==tabla[maxi][j]) {
							maxj=j;
						}
					}
				}
			}
		
		System.out.println("La posición del mayor es " + maxi + " "+maxj);
		System.out.println("La posición del menor es " + mini + " "+minj);
		}

	}
