// ASSUME THERE ARE TWO FRIENDS A AND B , READ THE NATIVE PLACE OF A AND B IF BOTH BELONGS TO SAME PLACE, PRINT MESSAGE THAT BOTH BELONGS TO SAME CITY,
// ELSE BOTH NOT BELONGS TO SAME CITY.   

import java.util.Scanner;
class Ass3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A's city");
		String city1=s.nextLine().trim().toUpperCase();
		System.out.println("Enter B's city");
		String city2=s.nextLine().trim().toUpperCase();

		System.out.println(city1.equals(city2));              // both can be used
		System.out.println(city1.equalsIgnoreCase(city2)); // ignores the case of words

	}
}
