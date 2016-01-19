
public class TwoLargest {

	public static void main(String[] args) {
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int largest;
		int secondLargest;
		
		largest = data[0];
		secondLargest = data[0];
		
		for (int index = 0; index < data.length; index++) {
			if (data[index] > largest) {
				largest = data[index];
			} if (data[index] > secondLargest) {
				secondLargest = data[index - 1];
			}
		}
		
		System.out.println("The largest number is: " + largest);
		System.out.println("The second largest number is: " + secondLargest);

	}

}
