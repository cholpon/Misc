import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

public class Test {

	// Stream to catch the System.output messages
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	PrintStream MyPrintStream = new PrintStream(outContent);

	// IMPORTANT: Save the old System.out!
	PrintStream old = System.out;

	// instantiate class object for testing
	Exercise ex_object = new Exercise();

	/*
	@org.junit.Test
	public void test() {
		// Tell Java to use your special stream
		System.setOut(MyPrintStream);

		// Print some output: goes to your special stream
		ex_object.printNumbers();

		// Put things back
		System.out.flush();
		System.setOut(old);

		// Show what happened
		// System.out.println("Here: " + outContent.toString());

		// Get result from stream in form of string
		String str_res = outContent.toString();

		// Split the string by line
		String[] res = str_res.split("\\r?\\n");

		// Assert Cases:
		assertEquals("1", res[0]); // 1 is not multiple of 3 or 5
		assertEquals("2", res[1]); // 2 is not multiple of 3 or 5
		assertEquals("Fizz", res[2]); // 3 is multiple of 3
		assertEquals("4", res[3]); // 4 is not multiple of 3 or 5
		assertEquals("FizzBuzz", res[29]); // 30 is multiple of 3 and 5 ->
											// FizzBuzz
		assertEquals("Buzz", res[4]); // 5 is multiple of 5 -> Buzz

	} */
	
	@org.junit.Test
	public void testPrintNumbersRefactored() {
		
		assertEquals ("Fizz", ex_object.fizzBuzz(3));
		assertEquals ("FizzBuzz", ex_object.fizzBuzz(30));
		assertEquals ("Buzz", ex_object.fizzBuzz(5));
		assertEquals ("1", ex_object.fizzBuzz(1));
	}

	@org.junit.Test
	public void testStrings() {
		String a = "abc";
		String b = "xyz";	
		String a2 = "Hi";
		String b2 = "There";
		String a3 = "xxxx";
		
		assertEquals ("axbycz", ex_object.concatStrings(a, b));
		assertEquals ("HTihere", ex_object.concatStrings(a2,b2));
		assertEquals ("xTxhxexre", ex_object.concatStrings(a3, b2));

	}
	
	@org.junit.Test
	public void testMaxBlock() {
		assertEquals (3, ex_object.maxBlock("abbccc"));
		assertEquals (5, ex_object.maxBlock("abbcccddddeeeee"));
		assertEquals (4, ex_object.maxBlock("xxyyxxzzzz"));
		assertEquals (3, ex_object.maxBlock("ababbbcccaaa"));
		assertEquals (6, ex_object.maxBlock("Makkkkjjjjjj"));
		assertEquals (7, ex_object.maxBlock("Majjjjjjjddnnmmiiiiii"));
	}
}
