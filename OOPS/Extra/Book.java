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
	public static void main(String[] args) 
	{
		Book b1=new Book();
		settitle=("the man");
		b1.setprice=(1000);
		System.out.println(b1.getbookid());
		System.out.println(b1.gettitle());
		System.out.println(b1.getprice());
	}
}
