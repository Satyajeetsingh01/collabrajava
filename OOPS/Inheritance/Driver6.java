//example program 1 Type-casting//
class Fruit
{
	String fruit="apple";
}

class Vegetable extends Fruit
{
	String vegetable="potato";
}

class Driver6 
{
	public static void main(String[] args)
	{
		Fruit f= new Fruit();
		Vegetable v=new Vegetable();
		Fruit f1=new Vegetable();
		//Vegetable v1=(Vegetable)(f);
		Vegetable v1=new Fruit();
	}
}
