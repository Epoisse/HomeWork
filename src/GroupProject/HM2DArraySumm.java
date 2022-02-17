package GroupProject;

public class HM2DArraySumm {

	public static void main(String[] args) {

		int sum = 0;
		int[][] twoD = { { 100, 200 }, { 300, 400, 500 }, { 600, 700, 800, 900 } };

		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				sum += twoD[i][j];
			}
		}
		System.out.println(sum);

	}

}
