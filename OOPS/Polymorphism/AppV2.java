//METHOD OVERRIDING
class AppV1 
{
	public void feature1() 
	{
		System.out.println("Oldest");
	}
}

class AppV2 extends AppV1
{
	public void feature2() 
	{
		System.out.println("New feature added");
	}
	public void feature1() 
	{
		System.out.println("Updated feature");
	}

	public static void main(String args[]) 
	{
		AppV2 a= new AppV2();
		a.feature2 ();
	}
}

