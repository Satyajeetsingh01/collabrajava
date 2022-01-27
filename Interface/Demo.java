interface Demo
{
	int a=20;// final
	static {
	
		a=5;
	}

	void demo2();
	
	public static void main(String args[])
	{
		System.out.println("hello world"+a);
	}
	
}

class demo2 implements  Demo
{
	void demo2()
	{


	}
	demo2 d= new demo2();

}


