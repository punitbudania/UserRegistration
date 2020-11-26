package samplePackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password
{
	public static void pswd()
	{
		Scanner firstname = new Scanner(System.in);
		
		String any = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&-+=()])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(any, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(firstname.next());
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Done");
			
			found = true;
		}
		
		if(!found)
		{
			System.out.println("Invalid!! Try Again");
		}
	}
}
