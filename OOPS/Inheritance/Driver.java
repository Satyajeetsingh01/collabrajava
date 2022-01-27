//session 16 ac   tivity composition composition//

class Engine 
{
	private int engineno;
	private int cc;

	public int getengineno()
	{
		return engineno;
	}

	public int getcc()
	{
		return cc;
	}

	public void getEngineDetails()
	{
		System.out.println(engineno);
		System.out.println(cc);
	}

	Engine(int engineno,int cc)
	{
		this.engineno=engineno;
		this.cc=cc;
	}
}

class Car
{
	String model;
	int price; 
	String color;

	public void getCarDetails()
	{
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);
	}

	Car(String model,int price,String color)
	{
		this.model=model;
		this.price=price;
		this.color=color;
	}

	Engine e1=new Engine(120,150);
}

class Driver
{
	public static void main(String args[])
	{
		Car c1=new Car("honda",25000,"Red");
		System.out.println("=========Engine Details are=====");
		c1.e1.getEngineDetails();
		System.out.println("=========Car Details are=====");
		c1.getCarDetails();
	}
}
