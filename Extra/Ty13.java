import java.util.Scanner;
class Ty13
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a integer number");
		int m=s.nextInt();
		Loop(m);
		
	}
	public static void Loop(int a)
	{
		int i=a;
		while(i>0)
		{
			int temp=i%10;
			System.out.print(temp);
			i=i/10;
		}
	}
}
