class Book 
{
	private int bookid;
	private String title;
	private int price;

	public int getbookid()
	{
		return bookid;
	}

	public String gettitle()
	{
		return title;
	}

	public int getprice()
	{
		return price;
	}

	public void settitle(String title)
	{
		this.title=title;
	}

	public void setprice(int price)
	{
		this.price=price;
	}

	Book()
	{
		
	}
	
	Book(int bookid)
	{
		this.bookid=bookid;
	}

	Book(int bookid, String title, int price)
	{
		this(bookid);
		this.title=title;
		this.price=price;
	}
}

class  bookdriver
{
	public static void main(String[] args) 
	{
		Book b1=new Book(01,"the end",1000);


		System.out.println("book id");
		System.out.println(b1.getbookid());
		System.out.println("----------------");

		System.out.println("Title before update");
		System.out.println(b1.gettitle());
		System.out.println();

		b1.settitle("main starts");
		System.out.println("Title after update");
		System.out.println(b1.gettitle());
		System.out.println("----------------");

		System.out.println("price before update");
		System.out.println(b1.getprice());
		System.out.println();

		b1.setprice(544444);
		System.out.println("price after update");
		System.out.println(b1.getprice());
	}
}
