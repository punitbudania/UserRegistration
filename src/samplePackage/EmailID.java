package samplePackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID 
{
	public static void email()
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "^([a-z]{3})([+_.-]?[0-9a-z]{3,})?([@][0-9a-z]{1,})([.][a-z]{2,})([.][a-z]{2,})?";
		Pattern pattern = Pattern.compile(any, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(firstname.next());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Enter MobileNo:");
			
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
}
