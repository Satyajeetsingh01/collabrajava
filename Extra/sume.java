class  sume
{
	public static void main(String[] args) 
	{
		int i=50;
		int sum=0;
		while(i<=100)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum of even no is "+sum);

	}
}
