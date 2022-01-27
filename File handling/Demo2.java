// read the file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class  Demo2
{
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		//T1000 AUTO-GENERATED METHOD STUB
		Scanner s=new Scanner(System.in);
		FileInputStream n=new FileInputStream("E:\\Selenium\\first.txt");
		/*System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());
		System.out.println((char)n.read());*/

		int a=n.read();
		while((a)!=-1)
		{
			System.out.print((char)a);
			//to update the variable a 
			a=n.read();
		}
		n.close();
		System.out.println();
		System.out.println("done");
	}
}
