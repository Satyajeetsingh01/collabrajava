class Arr4
{
	public static void main(String[] args)
	{
		String s="aabbccddeee";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total no of letter in String s= "+count);
	}
}