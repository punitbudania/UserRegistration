package samplePackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNo
{
	public static void mobile()
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "[0-9]{2}\\s[0-9]{10}";
		Pattern pattern = Pattern.compile(any, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(firstname.next());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Enter Password:");
			
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
}
