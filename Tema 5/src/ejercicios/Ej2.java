package ejercicios;

public class Ej2 {

	public static void main(String[] args) {
		int random[] = new int[10];
		for(int i=0; i<random.length; i++) {
			random[i] = (int) (Math.random()*100)+1;
		}
		int sumanumeros = 0;
		for(int i:random) {
			sumanumeros +=i;
		}
		System.out.println(sumanumeros);

	}

}
