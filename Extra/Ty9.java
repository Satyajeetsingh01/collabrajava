import java.util.Scanner;
class Ty9 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		Loop(m);


	}
	public static void Loop(int a)
	{
		int i=1;
		while(i<=a)
		{
			System.out.println(i);
				i++;
		}
	}
}
