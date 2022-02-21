package GroupProject;

public class HM2DArraySumm {

	public static void main(String[] args) {

		int sum = 0;
		int[][] array = { { 100, 200 }, { 300, 400, 500 }, { 600, 700, 800, 900 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);

	}

}
