//upcasting and downcasting

import java.util.Scanner;
class Ball
{
	private double radius;
	public double getradius()
	{
		return radius;
	}

	public void setradius(double radius)
	{
		this.radius=radius;
	}
}
	
class BasketBall extends Ball
{
	String game="Basket Ball";
}

class TennisBall extends Ball
{
	String game="Tennis";
}

class Bag
{
	Ball ball;
	
	void addBall(Ball ball)
	{
		this.ball=ball;
	}

	void removeBall()
	{
		ball=null;
	}

	void isBagEmpty()
	{
		if(ball==null)
		{
		System.out.println("Bag is empty");
		}
		else
		{
		System.out.println("Bag is not empty");
		}
	}

	void showGame()
	{
		if(ball instanceof BasketBall)
		{
			BasketBall b= (BasketBall)ball;//downcasting
			System.out.println("you can play"+b.game+"ball game");
		}
		else
		{
			TennisBall b=(TennisBall)ball;//downcasting
			System.out.println("you can play"+b.game+"ball game");
		}	
	}
}

class Userinterface
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		Bag bag=new Bag();
		boolean flag=true;
		do
		{
		System.out.println("****************************");
		System.out.println("1...ADD BALL");
		System.out.println("2...Remove Ball");
		System.out.println("3...Check bag is Empty or not");
		System.out.println("4...Show game that can be played");
		System.out.println("5...Exit");
		System.out.println("please enter your choice");
		System.out.println("****************************");
		int a=s.nextInt();
		
		switch(a)
			{
				case 1:
				{
					System.out.println("1...Basketball");
					System.out.println("2...Tennisball");
					System.out.println("please enter your choice");
					int b1=s.nextInt();
					switch(b1)
					{
						case 1:
						{
							bag.addBall(new BasketBall());
							System.out.println("Basketball is successfully added");
						}
						break;

						case 2:
						{
							bag.addBall(new TennisBall());
							System.out.println("Tennisball is successfully added");
						}
					}
				}
				break;

				case 2:
				{
					bag.removeBall();
					System.out.println("Ball is successfully removed in to the bag");
				}
				break;

				case 3:
				{
					bag.isBagEmpty();
				}
				break;

				case 4:
				{
					bag.showGame();
				}
				break;

				case 5:
				{
					flag=false;
				}
			}
		}
		while (flag);
	}
}
