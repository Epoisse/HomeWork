package GroupProject;

public class HWMaxAndMinInArray {

	public static void main(String[] args) {

		int[] array = { 6, 3, 5, 7, 8, 2, 4 };
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			int a = array[i];

			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}

		}
		System.out.println("The max number is " + max);
		System.out.println("The min number is " + min);

	}
}