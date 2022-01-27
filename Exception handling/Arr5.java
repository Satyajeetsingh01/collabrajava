class Arr5 
{
	public static void main(String[] args)  //Arithmetic has already been caught
	{
		int a=10;
		int b=0;

		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception is handled");
		}
		catch(ArithmeticException E)
		{
			System.out.println("exception is handled");
		}
		
	}
}
