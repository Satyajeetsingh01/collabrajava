 // Sum of least and second least numbers

import java.util.Scanner;
class sumofleast
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = s.nextInt();
		int[]a = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)	
			{
				if(a[i] > a[j])
				{
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
				}
			}
		}		
		System.out.print("The sum of the least 2 elements is: "+(a[0]+a[1]));
		s.close();
	}
}
