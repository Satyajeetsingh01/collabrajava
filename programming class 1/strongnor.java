//Question 22 check a strong number or not
class strongnor
{
	public static void main(String[] args) 
	{
		for(int k=1;k<=500;k++)
		{
			int sum=0;
			for(int i=k;i>0;i=i/10)
			{
				int fact=1;
				for(int j=i%10;j>0;j--)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
			if(k==sum)
			{
				System.out.println(k+"");
			}
		}
	}
}
