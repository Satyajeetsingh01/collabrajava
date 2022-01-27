// Remove duplicate characters in a word

import java.util.Scanner;
class Dword
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		String str = "hi hello welcome hello hi to Bangalore";//s.nextLine().trim();

		String[]a = str.split(" ");

		for(int i=0; i<a.length; i++)
		{
			String temp = a[i];
			for(int j=i+1; j<a.length; j++)
			{			
				if(temp.equals(a[j]))
				{
					a[j] = "0";
					a[i] = "0";
				}
			}		
		}	
		
		System.out.println("The filtered sentence is: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != "0")
			{
				System.out.print(a[i]+" ");
			}
		}
		s.close();
	}
}
