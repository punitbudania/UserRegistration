package samplePackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNo
{
	public static void mobile()
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "[91]{2}\\s[789]{1}[0-9]{9}";
		Pattern pattern = Pattern.compile(any, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(firstname.nextLine());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Enter Password:");
			Password paswrd = new Password();
			paswrd.pswd();
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
}
