//Print numbers from 1-100
//If multiple of 3 replace with Fizz
//If multiple of 5 replace with Buzz
//If multiple of 3 and 5 replace with FizzBuzz

class FizzBuzz {
	public static void main (String args []) {
		//create variable
		int x;
		
		for (x=1 ;x <= 100; x++)
		{
			if (x % 5 == 0 && x % 3 == 0) {
				System.out.println("FizzBuzz ");
			}
			else if (x % 3 == 0) { 
				System.out.println("Fizz ");
			}
			else if (x % 5 == 0) {
				System.out.println("Buzz ");
			}
			else {
			System.out.println(x+" ");	
			}
		
		}
			
	}

}
