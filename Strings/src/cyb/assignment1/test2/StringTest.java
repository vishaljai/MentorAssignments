package cyb.assignment1.test2;
 
// Another class in other package to test String Pool
public class StringTest {
	
	public static void main(String[] args) {
	
		// Local variable
		String name1 = "Vishal";

		// Importing global variable of another package, another class
		System.out.println(cyb.assignment1.test1.StringTest.name==name1);// Comparing and getting the result

	}

}

/*Output:
 * true
 */