// write in the file
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class  Demo
{
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		//T1000 AUTO-GENERATED METHOD STUB
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=s.nextLine();
		FileOutputStream n=new FileOutputStream("E:\\javaclass\\sanu1.txt");
		System.out.println("file is successfully created");

		for(int i=0;i<str.length();i++)
		{
			n.write(str.charAt(i));
		}
		n.close();
		System.out.println("file is successfully closed");
	}
}
