package samplePackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName 
{
	public static void lastname()
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "^[A-Z][a-z]{2,}";
		Pattern pattern = Pattern.compile(any, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(firstname.next());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Enter EmailID:");
			
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
}



