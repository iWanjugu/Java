import java.util.Scanner;

class MathOperators {
	public static void main(String args []) {
		Scanner two = new Scanner(System.in);
		
		// int - whole number
		// when using two ints to do some calculation result is always an int
		//Using float will give you a result in decimal
		
		int girls, boys, people;
		girls = 11;
		boys = 3;
		people = girls % boys; //finds remainder of ints
		
		System.out.println(people);
		
	
	}
}