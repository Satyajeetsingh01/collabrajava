// Arrays inbuilt methods

import java.util.Arrays;

class  Demo
{
	//int[]b;
	public static void main(String[] args) 
	{

		int[]a = {5,4,3,2,1};
		
		// it is an inbuilt method of arrays class.
		// it is a static overloaded method.
		// Arrays.sort method internally uses comapareTo(Object o) method.
		Arrays.sort(a);


		for (int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		Arrays.reverse(a);


		for (int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
