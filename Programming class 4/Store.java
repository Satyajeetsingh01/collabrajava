//ASSIGNMENT 4 STORE THE VALUES PRESENT IN A AND B IN SAME ARRAY AB.

import java.util.Scanner;
class Store
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);

		System.out.println("enter the size OF A");
		int asize=s.nextInt();
		int a[]=new int[asize];
		for(int i=0;i<asize;i++)
		{
			System.out.println(" enter the "+(i+1)+"  element value of A ");
			a[i]=s.nextInt();
		}

		System.out.println("enter the size OF B");
		int bsize=s.nextInt();
		int b[]=new int[bsize];
		for(int i=0;i<bsize;i++)
		{
			System.out.println(" enter the "+(i+1)+"  element value of B");
			b[i]=s.nextInt();
		}

		int csize=asize+bsize;
		int c[]=new int[csize];
		int j=0;
		for(int i=0;i<csize;i++)
		{

			if(i<asize)
			{
				c[i]=a[i];
			}

			else
			{
				c[i]=b[j++];
			}
		}

		for(int i=0;i<csize;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}
