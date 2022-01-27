class mssqodrng 
{
	public static void range(int a, int b, int sum)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==1)
			{
				sum=sum+(i*i);
			}
		}
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args) 
	{
		range(1,5,0);
	}
}
