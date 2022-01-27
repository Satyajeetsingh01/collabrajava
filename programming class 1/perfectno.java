//Question 20 check perfect no or not 
class perfectno 
{
	public static void main(String[] args) 
	{
		int num=6;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("its a perfect no");

		}
		else
		{
			System.out.println("its not a perfect no");
		}
	}
}
