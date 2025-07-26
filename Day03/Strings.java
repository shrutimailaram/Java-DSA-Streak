import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        // Input strings
		        System.out.print("Enter first string (str1): ");
		        String str1 = scanner.nextLine();

		        System.out.print("Enter second string (str2): ");
		        String str2 = scanner.nextLine();

		        // 1. Concatenation
		        String concatenated = str1 + str2;
		        System.out.println("\nConcatenated String: " + concatenated);

		        // 2. Length Comparison
		        if (str1.length() == str2.length()) {
		            System.out.println("Both strings have the same length.");
		        } else if (str1.length() > str2.length()) {
		            System.out.println("str1 is longer than str2.");
		        } else {
		            System.out.println("str2 is longer than str1.");
		        }

		        // 3. Character-by-character Comparison
		        int minLength = Math.min(str1.length(), str2.length());
		        boolean differenceFound = false;
		        for (int i = 0; i < minLength; i++) {
		            if (str1.charAt(i) != str2.charAt(i)) {
		                System.out.println("First differing character at index " + i + ": '" 
		                                   + str1.charAt(i) + "' vs '" + str2.charAt(i) + "'");
		                differenceFound = true;
		                break;
		            }
		        }
		        if (!differenceFound) {
		            if (str1.length() != str2.length()) {
		                System.out.println("Strings are identical up to length " + minLength 
		                                   + " but have different lengths.");
		            } else {
		                System.out.println("Strings are identical.");
		            }
		        }

		        // 4. Substring Check
		        if (str1.contains(str2)) {
		            int index = str1.indexOf(str2);
		            System.out.println("str2 is a substring of str1 starting at index " + index);
		        } else {
		            System.out.println("str2 is not a substring of str1.");
		        }

		        scanner.close();
		    }
		
		
		
	}
	


