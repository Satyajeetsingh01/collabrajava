//7th question find the factorial of each digits of a given number
class factorialdigits
{
	public static void main(String[] args) 
	{
		int num=123;
		while(num>0)
		{
			int temp=num%10;
			int fact=1;
			while(temp>0)
			{
				fact=fact*temp;
				temp--;

			}
			System.out.println(fact);
			num=num/10;
		}
	}
}
