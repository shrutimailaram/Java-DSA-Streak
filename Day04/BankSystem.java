import java.util.Scanner;

public class BankSystem {

	double balance=5000;
	int ch;
	public void checkBalance() {
		System.out.println("Current Balance is:"+balance);
	}
	public void Deposite(int amount) {
		balance=balance+amount;
		System.out.println("After Deposited current balance is:"+balance);
	}
	public void Withdraw(int amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("After Withdrawing balance is:"+balance);
		}
		else {
			System.out.println("OOPS!!! Transaction cancelled Due to insufficient balance");
		}
	}
	public static void main(String[] args) {
		BankSystem b=new BankSystem();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Press1-To check Balance:");
			System.out.println("Press2-Deposite Money");
			System.out.println("Press3-Withdraw Money");
			System.out.println("Press4-Exit");
		System.out.println("Enter choice:");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			b.checkBalance();
		break;
		
		case 2:
			System.out.println("Enter amount:");
			int amount=sc.nextInt();
			b.Deposite(amount);
			
		break;
		case 3:
			System.out.println("Enter amount:");
		int amount1=sc.nextInt();
		b.Withdraw(amount1);
		break;
		case 4:
			System.out.println("Transaction Done!!!");
			break;
		default:
			System.out.println("Wrong choice");
		}
		}
		while(ch!=4);
		

	}


}
