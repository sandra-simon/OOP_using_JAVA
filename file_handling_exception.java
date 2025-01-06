/*a java program that read from a file and write to file by handling all file related exceptions.*/


import java.util.Scanner;
import java.io.*;

class FileReadWrite
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter file Name : ");
		String filename = s.nextLine();
		File file = new File(filename);

		try
		{
			if(file.createNewFile())
			{
				System.out.println("File created succesfully" + file.getName());
			}
			else
			{
				System.out.println("File already Exist");
			}
		}
		catch (IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
			return;
		}
		try(FileWriter writer = new FileWriter(file))
		{
			System.out.print("\nEnter the text to insert : ");
			String str = s.nextLine();
			writer.write(str);
			System.out.print("\nText written succesfully");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try(FileReader reader = new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(reader))
		{
			System.out.println("\n\nThe contents in the file are: \n");
			String line;
			while((line=bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.print("\nFile not found");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.print("\nError Occured");
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
	}
}