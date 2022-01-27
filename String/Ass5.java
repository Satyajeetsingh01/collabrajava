//WAJP TO REVERSE THE GIVEN STRING

import java.util.Scanner;
class Ass5
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");

		String name=s.nextLine().trim();
		String rev=" ";

		for(int i=name.length()-1;i>=0;i--)
		{
			rev + =name.charAt(i);
		}
		System.out.println(rev.trim());

	}
}
