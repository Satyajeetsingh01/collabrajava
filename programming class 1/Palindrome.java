// Question 13 palindrome or not
class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=1221;
		int num1=num;
		int temp;
		int reverse=0;
		while(num>0)
		{
			temp=num%10;
			reverse=reverse*10+temp;
			num=num/10;
		}
		if(num1==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
