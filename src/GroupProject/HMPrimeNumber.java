package GroupProject;

import java.util.Scanner;

public class HMPrimeNumber {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number");
		int num = input.nextInt();
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				System.out.println("not a prime");
				break;
			} else if (i == num - 1) {
				System.out.println("prime");
				break;
			} else {
				i++;
			}
		}
		input.close();
	}
}