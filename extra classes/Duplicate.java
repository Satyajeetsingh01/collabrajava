//REMOVE DUPLICATE CHARACTERS FROM A STRING
import java.util.Scanner;
class Duplicate
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = s.next();
		char[]wordArray = word.toCharArray();
		
		for(int i=0; i<wordArray.length; i++)
		{
			char temp = wordArray[i];
			for(int j=i+1; j<wordArray.length; j++)
			{
				if(temp == wordArray[j])
				{
					wordArray[j] = '0';
					wordArray[i] = '0';
				}
			}
			if(wordArray[i] != '0')
			{
				System.out.print(wordArray[i]);
			}
		}
		s.close();
	}
}
