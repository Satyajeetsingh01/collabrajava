public class Strings
{
	public static void main(String[] args)
	{
		String s="aabbccddeee";
		char [] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char b=a[i];
			for(int j=0;j<s.length();j++)
			{
				if(a[j]==b)
				{
					count++;
				}
			}
			System.out.println(count "is the count of the character "+b);
		}
	}
}