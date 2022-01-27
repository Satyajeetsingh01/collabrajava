// question 11 sum of even and odd digits of a number
class sumeo 
{
	public static void main(String[] args) 
	{
		int num=5234;
		int sume=0;
		int sumo=0;
		while(num>0)
		{
			int l=num%10;
			if(l%2==0)
			{
				sume=sume+l;
			}
			else
			{
				sumo=sumo+l;
			}
			num=num/10;
		}
		System.out.println(sume);
		System.out.println(sumo);
	}
}
