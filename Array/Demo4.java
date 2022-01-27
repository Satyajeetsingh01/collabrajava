//ASSIGNMENT 4 SUMMATION OF EVEN VALUES AND ODD VALUES IN THE ARRAY

import java.util.Scanner;
class Demo4
{
	public static void main(String[] args) 
	{   
		int sume=0;
		int sumo=0;
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
			if(a[i]%2==0)
			{
				sume=sume+a[i];
			}
			else
			{
				sumo=sumo+a[i];
			}
		}
		System.out.println("sum of even no is :"+sume);
		System.out.println("sum of odd no is :"+sumo);
	}
}
