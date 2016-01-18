class ReverserVersion2 {

	public static void main ( String[] args ) {
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int[] result = new int[data.length];

		for ( int j = 0; j < data.length; j++) {
			result[j] = data[data.length - j - 1];
		}
		for ( int j = 0; j < data.length; j++) {
			System.out.println(result[j]);
		}
	}
}