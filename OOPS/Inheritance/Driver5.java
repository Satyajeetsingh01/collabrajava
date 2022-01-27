//session 16 composition//
class Processor
{
	int speed;
	String generation;

	void displayAttributes()
	{
		System.out.println("speed is: "+speed);
		System.out.println("generation is: "+generation);

	}

	Processor(int speed, String generation)
	{
		this.speed=speed;
		this.generation=generation;
	}
}

class Laptop
{
	String brand;
	double mrp;

	void displayAttributes()
	{
		System.out.println("Brand is :"+brand);
		System.out.println("mrp is "+mrp);
	}
	Laptop(String brand, double mrp)
	{
		this.brand=brand;
		this.mrp=mrp;
	}
	Processor p1=new Processor(50,"i5");
}

class Driver5
{
	public static void main(String[] args) 
	{
		Laptop l1=new Laptop("Lenovo",10000.0);
		l1.p1.displayAttributes();
		l1.displayAttributes();

	}
}
