//Question 22 check a strong number or not
class stro
{
	public static void main(String[] args) 
	{
		int num=1;
		while(num<=500)
		{
			int sum=0;
			while(num>0)
			{
				int temp=num%10;
				int fact=1;
				while(temp>0)
				{
					fact=fact*temp;
					temp--;
				}
				sum=sum+fact;
				num=num/10;
			}
			num++;
			
		}
		System.out.println(num);
		
	}
}
 