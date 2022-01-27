//EXAMPLE 10 CART ANIMAL BIRD DOG CAT PARROT PIGEON
import java.utll.Scanner;
class Dog extends Animal
{
	double price=30000;
	String color="black";
	String age="10 months";
}

class Cat extends Animal
{
	double price=20000;
	String color="white";
	String age="2 months";
}

class Animal
{
	public void addDog()
	{
		return new Dog();
	}

	public void addCat()
	{
		return new Cat();
	}
}

class Parrot extends Bird
{
	double price=5000;
	String age="1 month";

}

class Pigeon extends Bird
{
	double price=1000;
	String age="5 months";
}

class Bird
{
	public void addParrot()
	{
		return new Parrot();
	}

	public void addPigeon()
	{
		return new Pigeon();
	}
}

class Cart
{
	Animal animal;
	Bird bird;
	Scanner s=new Scanner(System.in);
	void addToCart()
	{
		System.out.println("1. Animal");
		System.out.println("2. Bird");
		int num=s.nextInt();
		switch(num)
		{
			case 1:
			{
				System.out.println("1. Dog");
				System.out.println("2. Cat");
				int num1=s.nextInt();
				switch(num1)
				{
					case 1:
					{
						animal=animal.addDog();
					}
					break;

					case 2:
					{
						animal=animal.addCat();
					}
					break;

					default:
					{
						System.out.println("wrrong choice");
					}
				}
			}
			break;

			case 2:
			{
				System.out.println("1. Parrot");
				System.out.println("2. Pigeon");
				int num2=s.nextInt();
				switch(num2)
				{
					case 1:
					{
						bird=bird.addParrot();
					}
					break;

					case 2:
					{
						bird=bird.addPigeon();
					}
					break;

					default:
					{
						System.out.println("wrrong choice");
					}
				}
			}
			break;

			default:
			{
				System.out.println("wrrong choice");
			}
		}

	}

	public void isEmpty()
	{
		if((animal==null)&&(bird==null))
		{
		System.out.println("cart is empty");
		}
		else
		{
		System.out.println("cart is not empty");
		}
	}

	public void display()
	{
		if(animal instanceof Dog)
		{
			Dog d=(Dog)animal;
			System.out.println(d.price);
			System.out.println(d.color);
			System.out.println(d.age);
		}

		else if(animal instanceof Cat)
		{
			Cat c=(Cat)animal;
			System.out.println(d.price);
			System.out.println(d.color);
			System.out.println(d.age);
		}
		else if(bird instanceof Parrot)
		{
			Parrot p=(Parrot)bird;
			System.out.println(d.price);
			System.out.println(d.age);
		}

		else
		{
			Pigeon p1=(Pigeon)bird;
			System.out.println(d.price);
			System.out.println(d.age);
		}

	}

}

class Drivers
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		Cart cart=new Cart();
		System.out.println("1. add to cart");
		System.out.println("2. Cart is empty");
		System.out.println("3. Display");
		int num3=s.nextInt();
		switch(num3)
		{
			case 1:
			{
				cart.addToCart();
			}
			break;

			case 2:
			{
				cart.isEmpty();
			}
			break;

			case 3:
			{
				cart.display();
			}
			break;

			default:
			{
				System.out.println("wrrong choice");
			}
		}
	}
}




