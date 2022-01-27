// Swap to numbers without a third variable (temp)

import java.util.Scanner;
class swap
{
	public static void main(String[]args)
	{
		int a = 10, b = 30;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}