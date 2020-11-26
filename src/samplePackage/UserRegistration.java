package samplePackage;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration 
{
	public static void main(String[] args)
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "^[A-Z][a-z]{2,}";
		Pattern pattern = Pattern.compile(any);
		System.out.println("Enter FirstName:");
		Matcher matcher = pattern.matcher(firstname.next());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Enter LastName:");
			LastName checklastname = new LastName();
			checklastname.lastname();
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
	
	
	
}
