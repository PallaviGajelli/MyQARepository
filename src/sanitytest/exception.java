package sanitytest;

public class exception {

	public static void main(String[] args) {
		/*
		 * int d = 0; int n = 20; int fraction = n/d; System.out.println("End Of Main");
		 */

		int d = 1;
		  int n = 20;
		  try {
		   int fraction = n / d;
		   System.out.println("This line will be Executed only for valid value of d");
		  } catch (ArithmeticException e) {
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println(" \n End Of Main");
	}

}
