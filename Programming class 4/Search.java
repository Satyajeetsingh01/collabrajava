//ASSIGNMENT 3 SEARCH THE ELEMENT IN AN ARRAY 

import java.util.Scanner;
class Search
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println(" enter the "+(i+1)+"  element value ");
			a[i]=s.nextInt();
		}
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
		int search=s.nextInt();
		 int flag=0;

		for(int i=0;i<size;i++)
		{
			if(a[i]==search)
			{
				System.out.println(" element search "+search+"  found at "+i+" position ");
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println(" element "+search+" not found ");
		}
		
		
	}
}
