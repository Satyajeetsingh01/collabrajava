class Number
{
	private int sid;
	private String name;

	public int getsid()
	{
		return sid;
	}

	public String getname()
	{
		return name;
	}

	public void setsid(int sid)
	{
		this.sid=sid;
	}

	public void setname(int name)
	{
		this.name=name;
	}
	
}

class Encaptest
{
	publis static void main(String args[])
	{
	Number n1=new Number();
	n1.setsid(10);
	n1.setname("sanu");
	System.out.println(n1.getsid());
	System.out.println(n1.getname());
	}
	
}
