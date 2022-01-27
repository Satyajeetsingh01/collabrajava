//EXAMPLE OF Generic collection
import java.util.ArrayList;
public class Al4
{
	public static void main(String[] args) 
	{
		ArrayList <Integer>ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		//to find sum
		int sum=0;
		for(Integer   i: ls)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
