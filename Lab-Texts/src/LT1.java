import java.util.*;
public class LT1 {

	public static void main(String[] args) {
		//Question1();
		Question2();

	}
	
	public static void Question1() {
		System.out.println("QUESTION 1");
		int i0,i1,i2,i3,q1,q2,q3;
		double total,disrec,price;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of items (max:3): ");
		i0=in.nextInt();
		if (i0==1) {
			System.out.print("Enter price of first item: RM");
			i1=in.nextInt();
			System.out.print("Enter the quantity of first item: ");
			q1=in.nextInt();
			System.out.println();
			total=i1*q1;
			System.out.printf("Total price: RM%.2f\n",(total));
			if (total>100) {
				disrec=total*0.2;
				System.out.printf("Discount received: RM%.2f\n",(disrec));
				price=total*0.8;
				System.out.printf("Price to be paid: RM%.2f\n",(price));
			} if (total<=100) {
				disrec=total*0.1;
				System.out.printf("Discount received: RM%.2f\\n",(disrec));
				price=total*0.9;
				System.out.printf("Price to be paid: RM%.2f\\n",(price));
			}
			
		} 
		if (i0==2) {
			System.out.print("Enter price of first item: RM");
			i1=in.nextInt();
			System.out.print("Enter the quantity of first item: ");
			q1=in.nextInt();
			System.out.println();
			System.out.print("Enter price of second item: RM");
			i2=in.nextInt();
			System.out.print("Enter the quantity of second item: ");
			q2=in.nextInt();
			System.out.println();
			total=(i1*q1)+(i2*q2);
			System.out.printf("Total price: RM%.2f\n",(total));
			if (total>100) {
				disrec=total*0.2;
				System.out.printf("Discount received: RM%.2f\n",(disrec));
				price=total*0.8;
				System.out.printf("Price to be paid: RM%.2f\n",(price));
			} if (total<=100) {
				disrec=total*0.1;
				System.out.printf("Discount received: RM%.2f\\n",(disrec));
				price=total*0.9;
				System.out.printf("Price to be paid: RM%.2f\\n",(price));
			}
			
		} 
		if (i0==3) {
			System.out.print("Enter price of first item: RM");
			i1=in.nextInt();
			System.out.print("Enter the quantity of first item: ");
			q1=in.nextInt();
			System.out.println();
			System.out.print("Enter price of second item: RM");
			i2=in.nextInt();
			System.out.print("Enter the quantity of second item: ");
			q2=in.nextInt();
			System.out.println();
			System.out.print("Enter price of third item: RM");
			i3=in.nextInt();
			System.out.print("Enter the third of second item: ");
			q3=in.nextInt();
			System.out.println();
			total=(i1*q1)+(i2*q2)+(i3*q3);
			System.out.printf("Total price: RM%.2f\n",(total));
			if (total>100) {
				disrec=total*0.2;
				System.out.printf("Discount received: RM%.2f\n",(disrec));
				price=total*0.8;
				System.out.printf("Price to be paid: RM%.2f\n",(price));
			} if (total<=100) {
				disrec=total*0.1;
				System.out.printf("Discount received: RM%.2f\\n",(disrec));
				price=total*0.9;
				System.out.printf("Price to be paid: RM%.2f\\n",(price));
			}
		}		
	}
	
	public static void Question2() {
		System.out.println("QUESTION 2");
		double hours,sales;
		double wages,com=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter sales: ");
		sales=in.nextInt();
		System.out.print("Enter hours worked: ");
		hours=in.nextInt();
		if (150 <= sales && sales <= 300) {
			com=0.05*sales;
			System.out.printf("Commision: %.2f\n",(com));	
			wages=(hours*5)+com;
			System.out.printf("Daily wages: %.2f",(wages));
		} 
		if (sales > 301 && sales <= 500) {
			com=0.1*sales;
			System.out.printf("Commision: %.2f\n",(com));
			wages=(hours*5)+com;
			System.out.printf("Daily wages: %.2f",(wages));
		} 
		if (sales >= 501) {
			com=0.15*sales;
			System.out.printf("Commision: %.2f\n",(com));
			wages=(hours*5)+com;
			System.out.printf("Daily wages: %.2f",(wages));
		}
	}

}
