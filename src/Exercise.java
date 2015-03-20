
public class Exercise {

	
	public void printNumbers () {
		
		//iterate over numbers
		for (int i = 1; i <=100; i++) {
			
			// both cases
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println ("FizzBuzz");
			} else {
				// case: multiple of 3
				if (i % 3 == 0) {
					System.out.println ("Fizz");
				} else
				// case: multipile of 5
				if (i % 5 == 0) {
					System.out.println ("Buzz");
				} else {
			    // default case: print number
					System.out.println (i);
				}
			}
			
		}		
	}
}
