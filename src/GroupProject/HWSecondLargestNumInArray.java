package GroupProject;

public class HWSecondLargestNumInArray {

	public static void main(String[] args) {

		int[][] array = { { 3, 4, 2, 33 }, { 45, 552, 222 }, { 23, 444, 5525, 233, 22556, 22556 } };
		int a = 0;
		int b = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int c = array[i][j];
				if (c > a) {
					b = a;
					a = c;

				} else if (b < c && c != a)
					b = c;
			}
		}
		System.out.println(b);

	}

}
