import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int[] arr = {4, 2, 7, 4, 9, 4, 1, 4};

    
        System.out.print("Enter the number to count: ");
        int target = sc.nextInt();

     
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

   
        System.out.println("The number " + target + " appears " + count + " times in the array.");

        sc.close();
    }
}
