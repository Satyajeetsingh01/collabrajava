//session 16 activity aggregation//
class  Book
{
	String booktitle;
	int price;

	void getBookDetails()
	{
		System.out.println(booktitle);
		System.out.println(price);
	}

	Book()
	{
		
	}

	Book(String booktitle,int price)
	{
		this.booktitle=booktitle;
		this.price=price;
	}
}

class Bag
{
	String color;
	int price1;

	Book b;

	void storeBook(Book b)
	{
		this.b=b;
		System.out.println("Book is stored");
	}

	void removeBook()
	{
		b=null;
		System.out.println("Book is removed");
	}
}

class Driver3
{
	public static void main(String[] args)
	{
		Bag b1=new Bag();
		b1.storeBook(new Book("The end",500));
		b1.b.getBookDetails();
		b1.removeBook();

	}
}
