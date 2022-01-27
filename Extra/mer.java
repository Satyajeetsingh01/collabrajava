class mer 
{
	public static void range(int a)
	{
		if(a==101)
		{
			return;
		}
		if(a%2==0)
		{
			System.out.println(a);
		}
		a++;
		range(a);
	}
	public static void main(String[] args) 
	{
		range(50);
	}
}
