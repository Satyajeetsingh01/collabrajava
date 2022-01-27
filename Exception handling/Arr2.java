import java.util.Scanner;
class Arr2 
{
	public static void main(String[] args) 
	{
		for(int i=3;i>0;i--)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Thread interrupted but handled");
			}
		}
		System.out.println("Happy new year");
		
	}
} 
