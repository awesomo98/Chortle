import java.io.* ;

class NearlyZero {

	public static void main ( String[] args ) {
		int [] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int close = 0;

		for (int index = 0; index < data.length; index ++) {
			if (index == 0) {
				close = data[index];
			}
			if (Math.abs(ele - 0) < close) {
				close = data[index];
			}
		}
		System.out.println(close);
	}
}