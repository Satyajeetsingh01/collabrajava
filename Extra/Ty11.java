import java.util.Scanner;
class Ty11
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
		int count=0;
		while(i<b)
		{	
			count++;
			i++;
		}
		System.out.println(count);
	}
}
