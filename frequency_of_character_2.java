//a java program to find the frequency of a character in a given string using a constructor

import java.util.Scanner;
public class StringFrequency
{
	private String inputString;
	private char inputChar;

	public StringFrequency(String inputString, char inputChar)
	{
		this.inputString=inputString.toLowerCase();
		this.inputChar=Character.toLowerCase(inputChar);
	}

	public int calculateFrequency()
	{
		int count=0,i;
		for(i=0; i<inputString.length(); i++)
		{
			if(inputChar == inputString.charAt(i))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		String str;
		char ch;

		System.out.print("Enter a string : ");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();

		System.out.print("Enter a character to find its frequency : ");
		ch = s.next().charAt(0);
		StringFrequency stringFrequency = new StringFrequency(str,ch);
		int frequency = stringFrequency.calculateFrequency();
		System.out.print("Frequency of the character '"+ch+"' is: " +frequency);
		s.close();
	}
}
