//session 16 activity aggregation//
class Sim 
{
	private int simno;
	String serviceprovider;

	public int getsimno()
	{
		return simno;
	}

	public void getSimDetails(int simno,String serviceprovider) 
	{
		System.out.println(simno);
		System.out.println(serviceprovider);
	}

	Sim()
	{	
	}

	Sim(int simno, String serviceprovider)
	{
		this.simno=simno;
		this.serviceprovider=serviceprovider;
	}
}

class Mobile
{
	String model;
	int price;

	Sim s;

	public void getMobileDetails()
	{
		System.out.println(model);
		System.out.println(price);
	}

	public void insertSim(Sim s)
	{
		this.s = s;
		System.out.println("sim is inserted");
	}
	public void removeSim()
	{
		this.s=null;
		System.out.println("sim is removed");
	}

	Mobile(String model, int price)
	{
		this.model=model;
		this.price=price;
	}
}

class Driver2
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("nokia",1000);

		m1.insertSim(new Sim());
		m1.getMobileDetails();
		m1.s.getSimDetails(123,"idea");

		m1.removeSim();

	}
}
