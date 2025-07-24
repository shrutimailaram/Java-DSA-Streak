import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int fibo = first + second;
            first = second;
            second = fibo;
        }

        sc.close(); // Good practice
    }
}



//input - 5  
//output -  0 1 1 2 3 

/* 
 * public class Main{
    public static void main(String[] args){
        
         int value[] = {4,10,45,88,90};
         
        int max = value[0]  ;
        
        for(int i=1 ; i< value.length ; i++){
        if(value[i] > max){
        max = value[i];
        }
        }
        
         System.out.println("Largest element is: "+ max);
    }
    
}*/
