import java.util.Scanner ;
public class fibonacci {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 int n = Scanner.nextInt();
		 
		int  first = 0, second = 1; 
		
	for(int i = 1 ; i<= n ;i ++ ) {
	
			System.out.print(first + " ");
			int fibo = first + second;
			first = second ;
			second = fibo ;
		}
	}

	}



//input - 5  
//output -  0 1 1 2 3 