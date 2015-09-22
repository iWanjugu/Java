import java.util.Scanner;

public class UserInputAge {

	public static void main (String args []) {

		Scanner input = new Scanner(System.in);

		int age = 0;
		System.out.println ("Enter your age?");

		age = input.nextInt();

		System.out.printf ("You are " + age + " years of age.");
	}

}
