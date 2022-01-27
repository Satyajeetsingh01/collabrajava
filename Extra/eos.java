class eos
{
	public static void main(String[] args) 
	{
		int i=1;
		int sume=0;
		int sumo=0;
		while(i<=10)
		{
			if(i%2==0)
			{
				sume=sume+i;
			}
			else
			{
				sumo=sumo+i;
			}
			i++;
		}
			System.out.println("Sum of even no is "+sume);
			System.out.println("Sum of odd no is "+sumo);

		
	}
}
