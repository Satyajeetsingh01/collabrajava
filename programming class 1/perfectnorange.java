//Question 21 print perfect no in the given range  
class perfectnorange
{
	public static void main(String[] args) 
	{
		for(int num=1;num<=100;num++)
		{
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
				System.out.println(num);
			}
		}
	}
}
