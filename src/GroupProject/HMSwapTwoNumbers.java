package GroupProject;

public class HMSwapTwoNumbers {

	public static void main(String[] args) {

		int a = 3;
		int b = 6;

		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println("int a = " + a + " " + "int b = " + b);

	}

}
