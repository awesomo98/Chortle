import java.io.*;
import java.util.Scanner;
public class Title {

	public static void main(String[] args) {
		System.out.println("Enter a name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		if ((name == "Amy") || (name == "Buffy") || (name == "Cathy")) {
			System.out.println("Ms. " + name);
		}
	}


}
