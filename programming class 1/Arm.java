class Arm 
{
	public static void main(String[] args) 
	{
		int n=153;
		armsTr(n);
	}

	public static void armsTr(int n)
	{
		int p=0;
		int armStrong=0;
		for(int i=n;i>0;i=i/10) p++;

		for(int i=n;i>0;i=i/10)
		{
			int sum=1;
			for(int j=0;j<p;j++)
			{
				sum =sum*i%10;
			}
			armStrong =armstrong+sum;
		}
		if(armStrong == n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
