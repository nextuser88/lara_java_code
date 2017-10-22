// WAP to remove range of elements from the given array.
import java.util.Arrays;
class  G
{
	public static void main(String[] args) 
	{
		int[] x = {1, 3, 5, 7, 9, 10, 20, 11, 23, 25};
		int n = x.length;
		int from = 3, to = 7;
		System.out.println(Arrays.toString(x));
		for(int i = from; i <= to; i++)
		{
			for(int j = from+1; j < n; j++)
			{
				x[j-1] = x[j];
			}
			n--;
		}
		int[] y = new int[n];
		for(int i = 0; i < n; i++)
		{
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
