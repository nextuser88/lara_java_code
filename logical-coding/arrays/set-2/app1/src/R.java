// sort first half in ascending order and second half in the descending order.
import java.util.Arrays;
class  R
{
	public static void main(String[] args) 
	{
		int[] a = {10, 2, 5, 3, 13, 7, 20, 15};

		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i]+ ", ");
		}
		System.out.println();

		int n = a.length;
		int middle = n/2;
		int temp;

		for(int i = 0; i < middle-1; i++)
		{
			for(int j = 0; j < middle-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			}
		}

		for(int i = middle, int k = 0; i <(n-1); i++, k++)
		{
			for(int j = middle; j <(n-k-1); j++)
			{
				if(a[j]<a[j+1])
				{
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
		}
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i]+ ", ");
		}
		System.out.println();

	}
}
