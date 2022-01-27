class Book
{
	String title;
	double price;
	String author;
	{
		System.out.println("non static initializers");
	}
	public void display() 
	{
		System.out.println(title);
		System.out.println(price);
		System.out.println(author);
	}
	Book()
	{
		System.out.println("no argument constructor");

	}
	public static void main(String args[])
	{
		Book b1=new Book();
		b1.title="harry potter";
		b1.price=100;
		b1.author="Ram";
		b1.display();

	}

}
