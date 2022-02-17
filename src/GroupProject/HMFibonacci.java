package GroupProject;

public class HMFibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int counter = 1;

		while (counter <= 10) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			counter++;
		}

	}

}
