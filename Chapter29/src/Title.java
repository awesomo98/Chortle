import java.io.*;
import java.util.Scanner;
public class Title {

	public static void main(String[] args) {
		System.out.println("Enter a name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if (name.indexOf("Amy") >= 0
			|| name.indexOf("Buffy") >= 0
			|| name.indexOf("Cathy") >= 0) {
			System.out.println("Ms. " + name);
		} else if (name.indexOf("Elroy") >= 0
			|| name.indexOf("Fred") >= 0
			|| name.indexOf("Graham") >=0) {
			System.out.println("Mr. " + name);
		} else {
			System.out.println(name);
		}
	}


}
