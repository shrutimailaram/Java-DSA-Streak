
import java.util.Scanner ;
    public class palindrome{
	    public static void main(String[] args) {
		
	        int reverse = 0 ;
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number: ");
		    int n = sc.nextInt();
		    int original = n ;
		
		        while(n!=0) {
			
			        int digit = n%10;
			        reverse = reverse*10 + digit ;
			        n = n/10;
		        }
		        if(original==reverse) {
			        System.out.println(original+"  is a palindrome");	
			}
		        else {
			        System.out.println(original+" is not a palindrome");
		}
		        sc.close()	;
	}
	}

