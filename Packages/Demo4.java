//public to public  and protected to protected main
package pack4;
import pack5.Demo5;
public class Demo4 extends Demo5
{
	public static void main(String[] args) 
	{
		Demo4 d=new Demo4();
		
		System.out.println(d.a);
		System.out.println(d.b);
		//d.demo();
	}
}
