//Assignment 2
class Shape 
{
	
}

class Circle extends Shape
{
	int radius;

	Circle(int radius)
	{
		this.radius=radius;
	}

	@Override
	public String toString()
	{
		return " radius is :"+radius;
	}
}

class Rectangles extends Shape
{
	int length;
	int breadth;

	
	Rectangles(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	@Override()
	public String toString()
	{
		return "length is:"+length+"\n"+ "breadth is:"+breadth;
	}
}

class Drivera
{
	public static void main(String[] args)
	{
		Circle c=new Circle(5);
		System.out.println(c.toString());
		Rectangles r=new Rectangles(5,2);
		System.out.println(r.toString());
	}
}
