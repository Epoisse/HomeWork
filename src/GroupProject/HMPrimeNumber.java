package GroupProject;

public class HMPrimeNumber {

	public static void main(String args[]) {
		int number = 67;
		boolean isTrue = true;

		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isTrue = false;
					break;
				}
			}

		} else {
			isTrue = false;

		}
		if (isTrue) {
			System.out.println("The number " + number + " is prime");
		} else {
			System.out.println("The number " + number + " is not prime");
		}

	}
}