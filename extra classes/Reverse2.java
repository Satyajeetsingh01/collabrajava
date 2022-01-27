// Reverse a given string

class Reverse2
{
	public static void main(String[]args)
	{
		String s = "ELF27SELENIUM";
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		String res = new String(str);
		System.out.println(res);
	}
}
