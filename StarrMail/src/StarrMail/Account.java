package StarrMail;

import java.util.Random;
import java.util.Scanner;

public class Account {
	private String firstName, lastName, password, department, address;
	private int capacity;
	Scanner in = new Scanner(System.in);
	
	//Constructor receiving first and last name
	Account(String first, String last)
	{
		this.firstName = first;
		this.lastName = last;
		System.out.println("Account Creation Successfull!!!!! Welcome to StarrMail, " + first + " " + last);
		this.department = setDepartment();
		System.out.println("You work in the " + this.department + " department");
		System.out.println("How long of a password can you remember?\nEnter desired password length: ");
		int length = in.nextInt();
		this.password = generatePass(length);
		System.out.println("Your password is " + this.password + " \nHope no one was lookin at the screen");
		System.out.println("Would you like to change your password, or is that random mess of characters doin it for you?\nEnter 1 to change password\nEnter 0 to keep password");
		int choice = in.nextInt();
		if(choice == 1)
		{
			System.out.println("What would you like your new password to be: ");
			String pass = in.next();
			setPass(pass);
		}
	}
	
	
	//Prompts the user to enter which department they work in
	private String setDepartment()
	{
		int valid = 0;
		do
		{
		starrBar();
		System.out.println("Which department of Starr Corp do you work in, valued employee?\nEnter 1 for Jedi\nEnter 2 for Bounty Hunting\nEnter 3 for Rebel Scum\nEnter 4 to choose your own department, you creative genius you");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1:
				valid = 1;
				return "jedi";
			case 2:
				valid = 1;
				return "bounty-hunter";
			case 3:
				valid = 1;
				return "rebel-scum";
			case 4:
				valid = 1;
				System.out.print("Please enter your department: ");
				String dep = in.next();
				return dep;
			default:
				System.out.println("You entered an invalid number, you fool! Kindly try again");
		}
		}while(valid == 0);
		return "";
	}
	
	//Generate a random password of user selected length
	private String generatePass(int length)
	{
		String chars = "abcdefghijklmnopqrstuvwxyz123456789!@#$%&*";
		char[] pass = new char[length];
		Random rand = new Random();
		for(int i=0; i<length; i++)
		{
			pass[i] = chars.charAt(rand.nextInt(length));
		}
		return new String(pass);
				
	}
	
	//Changes password
	private void setPass(String pass)
	{
		this.password = pass;
		System.out.println("Your new password is " + this.password);
	}
	//Prints a bar of starrs, you know, for pizzaz!
	private void starrBar()
	{
		System.out.println();
		System.out.println("********************************************");
	}

}
