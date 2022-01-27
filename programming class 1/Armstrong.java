class Armstrong
{
	public static void main(String[] args) 
	{
		armstrong(153);
		
	}
	public static void armstrong(int num)
	{
		int count=0;
		int q=0;
		int n=num;
		for(int i=num;i>0;i=i/10)
		{
			count++;
		}
		for(int i=num;i>0;i=i/10)
		{
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow=pow*i%10;
			}
			q=q+pow;
		}
		System.out.println(q);
	}
}
