           public class StringComparison {
		    public static void main(String[] args) {
		        // Declare and initialize string variables
		        String str1 = "Hello";
		        String str2 = "hello";
		        String str3 = "World";

		        // Compare strings using equalsIgnoreCase
		        boolean result1 = str1.equalsIgnoreCase(str2);
		        boolean result2 = str2.equalsIgnoreCase(str3);

		        // Display the results
		        System.out.println("Comparison of str1 and str2 (ignoring case): " + result1);
		        System.out.println("Comparison of str2 and str3 (ignoring case): " + result2);
		    }
		

	}
