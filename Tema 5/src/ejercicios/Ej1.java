package ejercicios;

public class Ej1 {

	public static void main(String[] args) {
		int random[] = new int[10];
		for(int i=0; i<random.length; i++) {
			random[i] = (int) (Math.random()*100)+1;
			System.out.println(random[i]);
		}

	}

}
