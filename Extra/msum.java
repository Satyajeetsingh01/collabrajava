class msum 
{
	public static int range(int a,int b, int sum)
	{
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int result=(range(1,10,0));
		System.out.println("sum of all the no. is "+result);
	}
}
