//Write a program to remove one array elements from an another array.
import java.util.Arrays;
class  C
{
	public static void main(String[] args) 
	{
		int x[] = {10, 20, 55, 2 ,2, 4, 12, 34, 55, 5, 2, 20};
		int y[] = {2, 5, 20, 55};
		System.out.println("x:" + Arrays.toString(x));
		System.out.println("y:" + Arrays.toString(y));
		int found = 0;
		int n = x.length;
		for(int i = 0; i < y.length; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(y[i] == x[j])
				{
					found++;
					for(int k = j; k < x.length-1; k++)
					{
						x[k] = x[k+1];
					}
					n--;
					j--;
				}
			}
		}
		int[] z = new int[x.length - found];
		for(int i = 0; i < z.length; i++)
		{
			z[i] = x[i];
		}
		System.out.println("Z:" + Arrays.toString(z));
	}
}
