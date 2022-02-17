package GroupProject;

public class HWMaxAndMinInArray {

	public static void main(String[] args) {

		int[] array = { 2, 3, 5, 7, 8, 3, 4 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < array.length; i++) {
			int a = array[i];

			if (a > max) {
				max = a;
			} else {
				min = a;
			}

		}
		System.out.println("The number max number is " + max);
		System.out.println("The number max number is " + min);

	}
}