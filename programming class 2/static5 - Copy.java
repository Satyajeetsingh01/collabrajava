class static5 
{
	static int a=40;
	static int d;
	static 
	{
		System.out.println(a);
		System.out.println("first block");
		System.out.println(d);
	}
	static int b=demo();

	static 
	{
		System.out.println(a);
		System.out.println(static5.b);
		System.out.println(d);
		d=140;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public stativ int demo()
	{
		d=20;
		return 40;
	}
}
