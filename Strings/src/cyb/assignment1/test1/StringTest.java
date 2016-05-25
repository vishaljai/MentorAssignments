package cyb.assignment1.test1;

/**
 * @author Vishal Jain
 * 
 *         Class to test String Pool
 * 
 */
public class StringTest {

	// Global variable to be accessible everywhere
	public static String name = "Vishal"; // Object in String Literal Pool

	public static void main(String[] args) {

		// Local variables
		String name_again = new String("Vishal"); // Object create in heap
		String name_test = "Vishal"; // Object in String Literal Pool
		String name_test_again = "vishal"; // Object in String Literal Pool

		// Performing tests to check about String Literal Pool
		System.out.println("String Literal Pool Test: ");
		System.out.println(name == name_again);
		System.out.println(name == name_test);
		System.out.println(name == name_test_again);
		System.out.println(name_again == name_test_again);
		System.out.println(name_test == name_test_again);

		System.out.println("hashCode Test: ");

		System.out.println(name.hashCode());
		System.out.println(name_again.hashCode());
		System.out.println(name_test.hashCode());
		System.out.println(name_test_again.hashCode());

	}
}
/*
 * Output: 
 * String Literal Pool Test: 
 * false 
 * true 
 * false 
 * false 
 * false 
 * hashCode Test:
 * -1732361581 
 * -1732361581 
 * -1732361581 
 * -816228749
 */
