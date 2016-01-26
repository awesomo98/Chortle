import java.io.*;
import java.util.Scanner;

public class Microwave {
	public static void main(String[] args) {
		System.out.println("Enter cook time");
		Scanner scan = new Scanner(System.in);
		String time = scan.next();
		Int numbers = time.length();
		if (numbers == 2) {
			System.out.println("Your time 0:" + time);
		}
	}
}