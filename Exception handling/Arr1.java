//try-catch block
import java.util.Scanner;
class  Arr1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int a=s.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the index");
		int n=s.nextInt();
		try
		{
			System.out.println(arr[n]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("there is no value in this index");
		}
		
		System.out.println("end");
	}
}
