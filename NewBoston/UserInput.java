// USER INPUT

import java.util.Scanner; // letting java know that we'll be inputing stuff from an external input device (keyboard)

class UserInput {
	public static void main (String args []) {

		//create variable 'njugs' tell java that it's value will come from outside input
		Scanner njugs = new Scanner (System.in);

		//print it on screen
		System.out.println(njugs.nextLine()); //.nextLine - allows you to pause nad wait for input from external source


		//'njugs' now is assigned the string "hey now"
	}
}
