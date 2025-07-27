import java.util.Scanner;

public class Menu {
	String menuName;
	
	String menuType;
	
	int prise;
	
	int qty;
	
	void show() {
		System.out.println("Menu Name:"+menuName+"\nMenu Type:"+menuType+"\nMenu Prise:"+prise+"\nMenu Quantity:"+qty);
	}
	void calculateBill() {
		System.out.println("Total bill="+(prise*qty));
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Menu m=new Menu();
	System.out.println("Enter MenuName:");
	m.menuName=sc.nextLine();
	System.out.println("Enter MenuType:");
	m.menuType=sc.nextLine();
	System.out.println("Enter Menu Prise:");
	m.prise=sc.nextInt();
	System.out.println("Enter Menu Quantity:");
	m.qty=sc.nextInt();
	
	m.show();
	m.calculateBill();
       
	}

}
