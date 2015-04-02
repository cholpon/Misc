import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		// System.out.println(res);
		return res;
	}

	public int maxBlock(String str) {
		int cur_count = 0;
		int alternative_count = 0;
		char direct_prev = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) == direct_prev) {
				cur_count++;
			} else {
				// prev character and current character are not the same
				if (alternative_count > cur_count) {
					// current count is smaller, we can reset it to count new
					// character
					cur_count = 1;
					direct_prev = str.charAt(i);
				} else {
					// alternative count is smaller or equal,
					// save cur_count in alternative_count
					// reset cur_count to 1;
					alternative_count = cur_count;
					cur_count = 1;
					direct_prev = str.charAt(i);
				}
			}
		}

		if (cur_count >= alternative_count) {
			// System.out.println("Printing cur_count " + cur_count + " " +
			// direct_prev);
			return cur_count;
		} else {
			// System.out.println("Printing alternative_count " +
			// alternative_count + " " + direct_prev);
			return alternative_count;
		}
	}

	public boolean findPattern(String line, String pattern) {

		if (line.contains(pattern)) {
			return true;
		}
		return false;
	}

	public void printPattern(String fileName, String pattern)
			throws IOException {

		BufferedReader br = null;
		String sCurrentLine;

		br = new BufferedReader(new FileReader(fileName));

		while ((sCurrentLine = br.readLine()) != null) {
			if (findPattern(sCurrentLine, pattern)) {
				System.out.println(sCurrentLine);
			}
		}
		br.close();
	}
}
