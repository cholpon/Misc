public class Exercise {

	public void printNumbers() {

		// iterate over numbers
		for (int i = 1; i <= 100; i++) {

			// both cases
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else {
				// case: multiple of 3
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else
				// case: multiple of 5
				if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					// default case: print number
					System.out.println(i);
				}
			}
		}
	}

	public String fizzBuzz(int i) {
		// both cases
		if ((i % 3 == 0) && (i % 5 == 0)) {
			return ("FizzBuzz");
		} else {
			// case: multiple of 3
			if (i % 3 == 0) {
				return ("Fizz");
			} else
			// case: multiple of 5
			if (i % 5 == 0) {
				return ("Buzz");
			} else {
				// default case: print number
				return (Integer.toString(i));
			}
		}
	}

	public void printNumbersRefactored() {

		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBuzz(i));
		}
	}

	public String concatStrings(String a, String b) {

		String res = "";
		String smaller_str;
		String bigger_str;

		// determine which string is smaller
		if (a.length() <= b.length()) {
			smaller_str = a;
			bigger_str = b;
		} else {
			smaller_str = b;
			bigger_str = a;
		}

		// add characters from both strings, until smaller string is over
		for (int i = 0; i < smaller_str.length(); i++) {
			res = res + a.charAt(i) + b.charAt(i);
		}

		// add what is left of bigger string, if strings are not of the same
		// length
		if (smaller_str.length() != bigger_str.length()) {
			res = res + bigger_str.substring(smaller_str.length());
		}
		//System.out.println(res);
		return res;
	}
}
