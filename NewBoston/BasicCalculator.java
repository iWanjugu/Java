import java.util.Scanner; //import scanner

class BasicCalculator {
	public static void main (String args []) {
	Scanner one = new Scanner(System.in);	//variable for scanner
	//double fnum;
	//double snum;
	//double answer;
		//or

	double fnum, snum, answer; //declaring the variables
	System.out.println ("Enter first num: ");
	fnum = one.nextDouble(); //input for number. Method for string is .nextLine

	System.out.println ("Enter second num: ");
	snum = one.nextDouble();

	answer = fnum + snum;

	System.out.println(answer);
	}

}
