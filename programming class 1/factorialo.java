//question 10 find factors of odd digits of a given number
class factorialo
{
	public static void main(String[] args) 
	{
		int num=32145;
		while(num>0)
		{
			int temp=num%10;
			int fact=1;
			if(temp%2==1)
			{
				while(temp>0)
				{
					fact=fact*temp;
					temp--;
				}
				System.out.println(fact);
			}
			num=num/10;	
		}
	}
}
