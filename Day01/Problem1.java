//Reverse a Number

import java.util.Scanner;
public class Problem1{

	public static void main(String[] args ) {
		                                         //The Scanner class (comes from java.util)
		Scanner sc = new Scanner(System.in);    //This line is used to take input from the user in Java
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int original = num ;
		int reversed = 0;
		
		while(num!=0) {
			int digit = num % 10 ;
			reversed = reversed*10 + digit ;
			num = num/10 ;
			
		}
		System.out.println("The reversed number of " + original + " is " + reversed);
	}
	
}

 