/*a java program that shows the usage of try, catch, throws and finally*/

import java.util.Scanner;

public class TryCatch
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Enter two numbers to divide : ");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			float ans = (float)a/b;
			System.out.println("Result is : "+ans);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Error: Division by zero is not allowed.");
		}
		finally
		{
			System.out.println("Operation ended");
		}
	}
}