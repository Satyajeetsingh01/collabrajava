//Question 18 count even factors and odd factors of given no.
class Countfactors 
{
	public static void main(String[] args) 
	{
		int num=8;
		int counteven=0;
		int countodd=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
				{
					counteven++;
				}
				else
				{
					countodd++;
				}
			}
		}
		System.out.println("count of even is: "+counteven);
		System.out.println("count of odd is: "+countodd);
	}
}
