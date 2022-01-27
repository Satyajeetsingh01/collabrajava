//WAJP TO CHECK THE GIVEN STRING IS PALINDROME OR NOT

class Ass6
{
	public static void main(String[] args) 
	{
		String ss="root";
		StringBuffer sb=new StringBuffer(ss);
		StringBuffer revb=new StringBuffer(ss);
		
		for(int i=sb.length()-1;i>=0;i--)
		{
			revb.append(sb.charAt(i));
		}

		String revs = new String(revb);

		if(ss.equals(revs))
		{
			System.out.println(ss+" :palindrome");
		}
			else
		{
		    System.out.println(ss+" : not palindrome");	
		}
	}
}
