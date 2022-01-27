//EXAMPLE OF map Generic collection
import java.util.*;
public class H2
{
	public static void main(String[] args) 
	{
		HashMap <String,Double>map=new HashMap<String,Double>();
		map.put("smith",500.0);
		map.put("jack",900.0);
		map.put("miller",700.0);

		System.out.println(map);

		//only keys
		Set s=map.keySet();
		System.out.println(s);

		//only values
		Collection c= map.values();
		System.out.println(c);
	}
}
