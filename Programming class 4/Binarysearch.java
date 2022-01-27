//ASSIGNMENT 3  BINARY SEARCH

import java.util.*;
class Binarysearch
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

		/*for(int i=0;i<size;i++)
		{
			int temp=0;
			for(int j=i;j<size;j++)
			{
				if(a[i]>a[j])              // FOR SORTING IN ASCENDING ORDER
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}*/
		Arrays.sort(a); // FOR SORTING IN ASCENDING ORDER 
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
		int key=s.nextInt();

		int low=0;
		int high=size-1;
		int mid=0;
		boolean flag=false;

		while(high>=low)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				flag=true;
				break;
			}

			else if(key>a[mid])
			{
				low=mid+1;
			}

			else
			{
				high=mid-1;
			}
		}
		if(flag==true)
		{
			System.out.println("key is found");
		}
		else
		{
			System.out.println("key is not found");
		}
		
	}
}
