// Adam Starr

package StarrMail;

import java.util.Random;
import java.util.Scanner;

public class Account {
	private String firstName, lastName, password, department, address;
	private int capacity = 600;
	Scanner in = new Scanner(System.in);
	
	//Constructor receiving first and last name
	Account(String first, String last)
	{
		starrBar();
		this.firstName = first;
		this.lastName = last;
		System.out.println("Account Creation Successfull!!!!! Welcome to StarrMail, " + first + " " + last);
		this.department = setDepartment();
		System.out.println("You work in the " + this.department + " department");
		starrBar();
		System.out.println("How long of a password can you remember?\nEnter desired password length(Max length 20: ");
		int length = in.nextInt();
		this.password = generatePass(length);
		System.out.println("\nYour password is " + this.password + " \nHope no one was lookin at the screen\n");
		System.out.println("Would you like to change your password, or is that random mess of characters doin it for you?\nEnter 1 to change password\nEnter 0 to keep password");
		int choice = in.nextInt();
		if(choice == 1)
		{
			setPass();
		}
		starrBar();
		this.address = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() +"@" + this.department + ".starrcorp.com";
		System.out.println("Your default address is: " + this.address + "\nDo you wanna keep that boring username, or change it to somethin a little more exciting?\nEnter 1 to change address\nEnter 0 to keep default address and be boring");
		int switchUn = in.nextInt();
		if(switchUn == 1)
		{
			System.out.println("Great choice, what do you wanna change your username to? Be creative!");
			String un = in.next();
			this.address = un +"@" + this.department + ".starrcorp.com";
			System.out.println("Your new, much more exciting email address is: " + this.address);
		}
	}
	
	
	//Prompts the user to enter which department they work in
	public String setDepartment()
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
			pass[i] = chars.charAt(rand.nextInt(42));
		}
		return new String(pass);
				
	}
	
	//Changes password
	public void setPass()
	{
		System.out.println("What would you like your new password to be: ");
		String pass = in.next();
		this.password = pass;
		System.out.println("Your new password is " + this.password);
	}
	
	//Prints a bar of starrs, you know, for pizzaz!
	public void starrBar()
	{
		System.out.print("\n");
		System.out.println("********************************************");
		System.out.print("\n");
	}


	
	public int getCapacity() {
		return capacity;
	}


	
	public void setCapacity() {
		System.out.println("What should the new capacity be: ");
		int cap = in.nextInt();
		this.capacity = cap;
	}


	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress() {
		System.out.println("What do you wanna change your username to? Be creative!");
		String un = in.next();
		this.address = un +"@" + this.department + ".starrcorp.com";
		System.out.println("Your shiny new email address is: " + this.address);
	}
	
	public void setName()
	{
		System.out.println("What would you like to change your name to?\nFirst name: ");
		this.firstName = in.next();
		System.out.println("Last name: ");
		this.lastName = in.next();
		System.out.println("Your new name is " + this.firstName + " " + this.lastName);
	}
	
	public String getName()
	{
		String name = this.firstName + " " + this.lastName;
		return name;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
}

