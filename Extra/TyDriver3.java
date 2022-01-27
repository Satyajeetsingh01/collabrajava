class Laptop 
{
	String brand;
	int price;
	String color;
}
	
class TyDriver3
{
	public static void main(String[] args) 
	{
		Laptop l1=new Laptop();
		l1.brand="lenovo";
		l1.price=70000;
		l1.color="grey";
		System.out.println("=============================");
		System.out.println("brand:"+l1.brand);
		System.out.println("price:"+l1.price);
		System.out.println("color:"+l1.color);		
	}
}
