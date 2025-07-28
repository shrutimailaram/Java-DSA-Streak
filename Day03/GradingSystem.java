import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll no:");
		int rNo=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		System.out.println("Enter Marks for m1:");
		int m1=sc.nextInt();
		System.out.println("Enter Marks for m2:");
		int m2=sc.nextInt();
		System.out.println("Enter Marks for m3:");
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		double per=total/3;
		System.out.println("Student Roll number:"+rNo+
				"\nStudent Name:"+sname+
				"\nTotal Marks:"+total+"\nPercentage:"+per);
		
		if(per>=90) {
			System.out.println("A Grade");
		}
		else if(per>=75) {
			System.out.println("B Grade");
		}
		else if(per>=50) {
			System.out.println("C Grade");
		}
		else if(per>=35) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
	
		}

	}

}
