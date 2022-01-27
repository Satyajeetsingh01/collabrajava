 // Reverse a sentence

 class Reverses
 {
	 public static void main(String[]args)
	{
		String statement = "My name is Prasanna";
		String[]arr = statement.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
 }
