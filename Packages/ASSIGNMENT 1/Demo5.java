//protected to protected different package
package pack2;
import pack1.Demo4;
public class Demo5 extends Demo4
{
	public static void main(String[] args) 
	{
		Demo5 d=new Demo5();
		
		System.out.println(d.a);
		System.out.println(d.b);
	}
}
