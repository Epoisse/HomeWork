package GroupProject;

public class HMSumEvenAndOdd {

	public static void main(String[] args) {

		int evensum = 0;
		int oddsum = 0;
		int[][] nums = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11 }, { 12, 13, 14 } };

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] % 2 == 0) {
					evensum += nums[i][j];
				} else
					oddsum += nums[i][j];
			}
		}
		System.out.println("Summ of even numbers is " + evensum);
		System.out.println("Summ of even numbers is " + oddsum);
	}

}
