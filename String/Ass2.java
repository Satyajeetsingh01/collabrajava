// WAJP TO READ THE NAME OF THE CITY FROM THE USER AND DISPLAY LENGTH OF THE CITY NAME

import java.util.Scanner;
class Ass2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the city");
		String name=s.nextLine().trim();
		System.out.println(name.length());

	}
}
