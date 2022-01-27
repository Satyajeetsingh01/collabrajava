//finally block
class Arr3
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(5/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("array 3 file closed");
		}
		System.out.println("Hello World!");
	}
}
