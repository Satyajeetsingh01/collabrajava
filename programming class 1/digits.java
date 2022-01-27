//Question 6 print digits in a given number
class digits
{
	public static void main(String[] args) 
	{
		int num=256;
		int d;
		while(num>0)
		{
		d=num%10;
		System.out.println(d);
		num=num/10;
		}	
	}
}
