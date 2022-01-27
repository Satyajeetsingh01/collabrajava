// Question 15 print the prime numbers in the given range
class Primerange 
{
	public static void main(String[] args) 
	{
		for(int i=10;i<=20;i++)
		{
			boolean b=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b=true;
				}
			}
			if(b==false)
			{
				System.out.println(i);
			}
		}
	}
}
