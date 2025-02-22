package RealTimeApplication;

import java.util.Scanner;

public class TeaAndMe {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, Exception {
		System.out.println("Welcome to Tea and Mi");
		String choice="";
		Scanner sc=new Scanner(System.in);
		Ramlal ramu=new Ramlal();
		do {
			System.out.println("1. BlackTea");
			System.out.println("2. MilkTea");
			System.out.println("3. Cofee");
			System.out.println("4. Pav");
			System.out.println("----------------");
			System.out.println("Enter your choice");
//			String order=sc.next();
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				ramu.getOrder("RealTimeApplication.BlackTea");
				break;
			case 2:
				ramu.getOrder("RealTimeApplication.BlackTea");
				break;
			default:
				break;
			}
//			ramu.getOrder(order);
			
			System.out.println("Do you want to continue....[yeas/YES]");
			sc.next();
		}
		while(choice.equalsIgnoreCase("yes"));
		System.out.println("Visit Again");
	}
}
