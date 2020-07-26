//Adam Starr

package StarrMail;

import java.util.Scanner;

public class StarrMail{
//
	public static void main(String[] args) {
		System.out.println("Welcome to StarrMail, esteemed user!\nPlease enter first and last name to begin account creation");
		Scanner in = new Scanner(System.in);
		System.out.print("First name: ");
		String first = in.next();
		System.out.print("Last name: ");
		String last = in.next();
		Account acc = new Account(first, last);
		int choice = 0;
		acc.starrBar();
		do
		{
			acc.starrBar();
			System.out.println("What would you like to do?\nEnter 1 to view your name\nEnter 2 to change your name \nEnter 3 to view your password \nEnter 4 to change your password\nEnter 5 to view your username\nEnter 6 to change username\nEnter 7 to view department\nEnter 8 to change department\nEnter 9 to view inbox capacity\nEnter 10 to change inbox capacity\nEnter 11 to exit, we'll miss you!");
			choice = in.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println(acc.getName());
				System.out.println("");
				break;
			case 2:
				acc.setName();
				System.out.println("");
				break;
			case 3:
				System.out.println(acc.getPassword());
				System.out.println("");
				break;
			case 4:
				acc.setPass();
			case 5:
				System.out.println(acc.getAddress());
				System.out.println("");
				break;
			case 6:
				acc.setAddress();
			case 7:
				System.out.println(acc.getDepartment());
				System.out.println("");
				break;
			case 8:
				acc.setDepartment();
				break;
			case 9:
				System.out.println(acc.getCapacity());
				System.out.println("");
				break;
			case 10:
				acc.setCapacity();
				System.out.println("");
				break;
			case 11:
				System.out.println("Thanks for stopping by, have a fantastic day you super starr!");
			}
		}while(choice!=11);
		in.close();
	}

}
