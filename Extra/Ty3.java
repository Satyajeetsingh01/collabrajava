import java.util.Scanner;
class Ty3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		lucky(num);
		
	}
	public static void lucky(int num)
	{
		if(num%5==0)
		{
			System.out.println("Lucky");
		}
	}
}
