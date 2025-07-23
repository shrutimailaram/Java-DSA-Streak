
public class Twodarray {

	public static void main(String[] args) {

		int arr[][] = {  
				{1, 2, 3},
	            {7, 4, 2},
	            {3, 6, 8},
	            {4, 3, 9}
	        };
		
       int maxSum = Integer.MIN_VALUE; /*It’s the smallest number Java can store in an int, which is:-2147483648*/
	   int rowIndex = -1; //We start with -1 to mean "no row found yet".
	   
		for(int i = 0 ; i < arr.length ; i++) {
			int rowsum = 0;
			for(int j = 0 ; j < arr[i].length ; j++) {
				rowsum += arr[i][j];
			}
			if(rowsum > maxSum) {
				maxSum = rowsum ;
				rowIndex = i ;
			}
			
		}
		
	
		System.out.println("Row with the highest sum is at index: "+rowIndex);
		System.out.println("Highest sum is: "+maxSum);
		

	

}




}


