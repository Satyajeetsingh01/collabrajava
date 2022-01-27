import java.util.Scanner;
class Ty10
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int m=s.nextInt();
		System.out.println("Enter 2nd number");
		int n=s.nextInt();
		Loop(m,n);
	}
	public static void Loop(int a, int b)
	{
		int i=a;
		while(i<=b)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
