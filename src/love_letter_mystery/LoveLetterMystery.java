package love_letter_mystery;

import java.util.Scanner;

public class LoveLetterMystery 
{
	public static void loveLetter(String input) 
	{
		char array[] = input.toCharArray();
		int i, j, total = 0;
		for(i = 0, j = array.length - 1; i < array.length/2; i++, j--)
		{
			if(array[i] != array[j])
			{
				int first = array[i];
				int second = array[j];
				if(first - second > 0)
				{
					total = total + (first-second);
				}
				else
				{
					total = total + (second - first);
				}
			}
		}
		System.out.println(total);
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int count = Integer.parseInt(sr.nextLine());
		String input[] = new String[count];
		for(int i = 0; i < count; i++)
		{
			input[i] = sr.nextLine();
		}
		for(int i = 0; i < count; i++)
		{
			loveLetter(input[i]);
		}
		sr.close();
	}
}
