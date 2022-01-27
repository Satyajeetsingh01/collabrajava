import java.util.*;
import java.io.*;
class Demo7  extends Thread                                    // implements Runnable
{
	Demo7()
	{
	}
	
	public void run()
	{
		System.out.println("run method is executed ");
	    System.out.println("*************");
	}
	public void write()
	{
		FileOutputStream f1 = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String ");
		String n = s.nextLine();
		System.out.println("====================================");
		System.out.println("write method is executing");
		
		try
		{
			f1 = new FileOutputStream("E:\\testyantra\\folder.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException is handled ");
		}
		for(int i=0;i<n.length() ;i++)
		{
			try{
				f1.write(n.charAt(i));
			}
			catch(IOException ie)
			{
				System.out.println("IOException is handled");
			}
		}
		try{
		f1.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException is handled");
		}
		System.out.println("write method is executed");
		System.out.println("====================================");
		
	}
	public void read()
	{
		FileInputStream f2 = null;
		System.out.println("====================================");
		System.out.println("read method is executing");
		try
		{   f2 = new FileInputStream("E:\\testyantra\\folder.txt");
		}
		catch (Exception e)
		{
			System.out.println("Exception is handled ");
		}
		try{
			int i = f2.read();
			while(i != -1)
			{
				Thread.sleep(3000);
				System.out.print((char)i+" ");
				i= f2.read();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled ");
		}
		try{
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled ");
		}
		System.out.println('\n'+"read method is executed");
		System.out.println("====================================");
	}
}
class DriveThread4
{
	public static void main(String[] args) 
	{
		//Thread t1 = new Thread(new Demo7());
		//Thread t2 = new Thread(new Demo7()); 
		Demo7 t1 = new Demo7();
		Demo7 t2 = new Demo7();
		System.out.println(t1.getName());
		t1.start();
	    System.out.println(t2.getName());
		t2.start();
		
		t2.write();
		
		t1.read();
	}
}