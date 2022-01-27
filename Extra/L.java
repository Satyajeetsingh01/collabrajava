class  L
{
	public static void main(String[] args) 
	{
		for(int i=4;i<args.length;i--)
		{
			if(i<0)
			{
				break;
			}
			System.out.println(args[i]);
		}
	}
}
