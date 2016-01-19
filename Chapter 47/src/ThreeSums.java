import java.io.*;

public class ThreeSums {
	public static void main(String[] args) {
		int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
		int all = 0;
		int even = 0;
		int odd = 0;

		for (int index = 0; index < data.length; index++) {
			all = all + data[index];
			if (data[index] % 2 == 0) {
				even = even + data[index];
			}
			if (data[index] % 2 != 0) {
				odd = odd + data[index];
			}
		}

		// for ( int = 0; index < data.length; index ++)

		System.out.println("The sum of all is: " + all);
		System.out.println("The sum of the evens is: " + even);
		System.out.println("The sum of the odds is: " + odd);
	}
}
