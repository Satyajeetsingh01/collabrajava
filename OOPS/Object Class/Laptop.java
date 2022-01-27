//Assignment 3
class Laptop
{
	int ram;
	int rom;
	int pspeed;

	Laptop(int ram,int rom,int pspeed)
	{
		this.ram=ram;
		this.rom=rom;
		this.pspeed=pspeed;
	}
	@Override
	public String toString()
	{
		return "ram is"+ram+"\n"+"rom is:"+rom+"\n"+"pspeed is :"+pspeed;
	}

	public boolean equals(Object o)
	{
		Laptop l=(Laptop)o;
		if((this.ram==l.ram)&&(this.rom==l.rom)&&(this.pspeed==l.pspeed))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Laptop l1=new Laptop(4,64,512);
		Laptop l2=new Laptop(8,32,318);
		Laptop l3=new Laptop(4,64,512);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println(l1.equals(l3));
		System.out.println(l1==l3);
		System.out.println(l3.equals(l1));
		System.out.println(l1.  ram);

	}
}
