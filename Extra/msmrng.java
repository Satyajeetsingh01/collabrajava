class msmrng 
{
	public static void sum(int a, int b, int sum)
	{
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is :"+sum);
	}
	public static void main(String[] args) 
	{
		sum(1,5,0);
	}
}
