//ASSIGNMENT 3 SUMMATION OF TWO NUMBERS

import java.util.Scanner;
class Demo3 
{
	public static void main(String[] args) 
	{   
		int sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+"element value");
			a[i]=s.nextInt();
		}
		System.out.println();

		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is :"+sum);
	}
}
