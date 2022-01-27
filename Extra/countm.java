import java.util.Scanner;
class countm 
{
	public static int countNum(int num, int count)
	{
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int c=countNum(a,0);
		System.out.println("total number of digits in"+a+"is"+c);
	}
}
