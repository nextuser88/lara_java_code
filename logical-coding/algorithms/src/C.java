//Insertion Sort
import java.util.*;
class  C
{
	public static void main(String[] args) 
	{
		int [] input = {5, 1, 4, 6, 3, 7, 9, 0, 8};
		System.out.println(Arrays.toString(input));
		int temp;
		for(int i = 1; i< input.length; i++)
		{
			for(int j = i; j>0; j--)
			{
				if(input[j] < input[j-1])
				{
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}

			//System.out.println(Arrays.toString(input));
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(input));
	}
}
 