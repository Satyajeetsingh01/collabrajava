//static example 2
class statice1
{
	static int c=30;
	public static void main(String[] args) 
	{
		System.out.println(c); //30
		System.out.println(d); //40
		System.out.println(statice1.c); //30
		System.out.println(statice1.d); //40
	}
	static
	{
	}

	static int d=40;
}
