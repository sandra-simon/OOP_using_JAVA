//a java program that checks the frequency of a character in a string

import java.util.Scanner;

public class String_frequency
{
	public static void main(String[] args)
	{
		String str;
		int count=0,i;
		char ch;
		System.out.print("Enter a string : ");
		Scanner s = new Scanner(System.in);
		str = s.nextLine().toLowerCase();

		System.out.print("Enter a character to find frequency : ");
		ch = s.next().toLowerCase().charAt(0);

		for(i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
			{
				count ++;
			}
		}
		System.out.print("/nFrequency of the character is : "+count);
	}
}