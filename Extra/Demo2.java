/*session 2 activity 
Example program 1*/
class Demo
{
	double price;
	String brand;
	String color;
	Demo()
	{
		price=10.0;
		brand="raynolds";
		color="black";
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		System.out.println("==========features of pen===========");
		System.out.println("price is: "+d1.price);
		System.out.println("brand is: "+d1.brand);
		System.out.println("color is: "+d1.color);
	}
}

