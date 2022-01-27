// Sort array in ascending order

import java.util.Scanner;
class sorta
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
		
		System.out.print("The sorted array is: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		s.close();
	}
}