import java.util.Scanner;
class Ty1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		int r=s.nextInt();
		System.out.println("the area of circle is ="+areaofcircle(r));

		System.out.println("Enter length");
		int l=s.nextInt();
		System.out.println("Enter breadth");
		int b=s.nextInt();
		System.out.println("the area of rectangle is ="+areaofrectangle(l,b));

	}
		public static double areaofcircle(int a)
	{
		return 3.142*a*a;
	}
	public static int areaofrectangle(int a, int b)
	{
		return a*b;
	}

}
