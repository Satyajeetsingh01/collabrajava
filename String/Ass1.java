//WAJP TO CONCATINATE BOTH FIRST NAME AND LAST NAME
import java.util.Scanner;
class Ass1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first name");
	    String firstname=s.nextLine().trim().toUpperCase();

		System.out.println("Enter last name");
		String lastname=s.nextLine().trim().toUpperCase();

		System.out.println(firstname.concat(" "+lastname));

	}
}
