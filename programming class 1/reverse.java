//Question 12 reverse the digits of a given number
class reverse 
{
	public static void main(String[] args) 
	{
		int num=7654;
		int reverse=0;
		int temp;
		while(num>0)
		{
			temp=num%10;
			reverse=reverse*10+temp;
			num=num/10;
		}
		System.out.println(reverse);

	}
}
