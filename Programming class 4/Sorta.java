//ASSIGNMENT 1 SORT THE ELEMENTS OF AN ARRAY IN ASCENDING ORDER

import java.util.*;
class Sorta
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
		System.out.println();

		//Arrays.sort(a);   // for sroting in ascending order

		for(int i=0;i<size;i++)
		{
			int temp=0;
			for(int j=i;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
