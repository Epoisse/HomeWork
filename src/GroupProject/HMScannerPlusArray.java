package GroupProject;

import java.util.Scanner;

public class HMScannerPlusArray {

	public static void main(String[] args) {

		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int size = input.nextInt();

		int[] array = new int[size];

		System.out.println("Please enter values");

		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("The summ of array's numbers = " + sum);

		input.close();
	}
}
