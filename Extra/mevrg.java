class mevrg 
{
	public static void range(int a, int b)
	{
		for(int i=a;i<=b;i++)
		//while(a<=b)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}	
	}
	public static void main(String[] args) 
	{
		range(1,10);
	}
}
