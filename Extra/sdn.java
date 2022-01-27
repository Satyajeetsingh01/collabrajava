import java.util.Scanner;
class sdn 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		System.out.println(add(a,b));
	}
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
}
