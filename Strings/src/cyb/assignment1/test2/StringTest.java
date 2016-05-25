package cyb.assignment1.test2;

/**
 * @author Vishal Jain
 * 
 *         Another class in other package to test String Pool
 * 
 */
public class StringTest {

	public static void main(String[] args) {

		// Local variable
		String name1 = "Vishal";

		// Importing global variable of another package, another class
		System.out.println(cyb.assignment1.test1.StringTest.name == name1);// Comparing
																			// and
																			// getting
																			// the
																			// result

		// Printing hashCode
		System.out.println(cyb.assignment1.test1.StringTest.name.hashCode());
		System.out.println(name1.hashCode());

	}

}


/* Output: 
 * true 
 * -1732361581 
 * -1732361581
 */