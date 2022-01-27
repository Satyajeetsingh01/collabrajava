import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class  Demo1
{
	public static void main(String[] args) 
	{
		//T1000 AUTO-GENERATED METHOD STUB
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=s.nextLine();
		FileOutputStream n=null;
		try
		{
			n=new FileOutputStream("E:\\javaclass\\sanu.txt");
			System.out.println("File is successfully created");
		}
		catch (FileNotFoundException f)
		{
			System.out.println("the specified path is not available or operating system is not given");
		}

		for(int i=0;i<str.length();i++)
		{
			try
			{
				n.write(str.charAt(i));
			}
			catch (IOException e)
			{
				System.out.println("exception is handled");
			}
		}
		try
		{
			n.close();
			System.out.println("File is successfully closed");
		}
		catch (IOException e)
		{
			System.out.println("IOException is handled");
		}
	}
}
