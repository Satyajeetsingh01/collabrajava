class Pen 
{
	String brand;
	String color;
	int price;
}
	
class TyDriver2
{
	public static void main(String[] args) 
	{
		Pen p1=new Pen();
		p1.brand="paynl";
		p1.color="red";
		p1.price=10;
		System.out.println("1st pen details");
		System.out.println("brand:"+p1.brand);
		System.out.println("color:"+p1.color);
		System.out.println("price:"+p1.price);
		System.out.println("=============================");

		Pen p2=new Pen();
		p2.brand="gel";
		p2.color="black";
		p2.price=20;
		System.out.println("2nd pen details");
		System.out.println("brand:"+p2.brand);
		System.out.println("color:"+p2.color);
		System.out.println("price:"+p2.price);
		System.out.println("=============================");

		Pen p3=new Pen();
		p3.brand="ball";
		p3.color="blue";
		p3.price=50;
		System.out.println("3rd pen details");
		System.out.println("brand:"+p3.brand);
		System.out.println("color:"+p3.color);
		System.out.println("price:"+p3.price);
	}
}
