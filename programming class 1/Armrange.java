class Armrange
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=500;
		armsTr(a,b);
	}

	public static void armsTr(int a,int b)
	{
		for(int k=a;k<=b;k++)
		{
		    int p=0;
		    int armStrong=0;
		    for(int i=k;i>0;i/=10) p++;

		for(int i=k;i>0;i/=10)
		{
			int sum=1;
			for(int j=0;j<p;j++)
			{
				sum *= i%10;
			}
			armStrong += sum;
		}
		if(armStrong == k)
			{
				System.out.println(k+"");
			}
		}
	}
}
