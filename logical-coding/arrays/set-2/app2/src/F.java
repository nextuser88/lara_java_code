// WAP to develop 3rd array with the excluding common elements from the given two arrays.
import java.util.Arrays;
class  F
{
	public static void main(String[] args) 
	{
		int[] x = {10, 23, 30, 11, 22};
		int[] y = {10, 21, 30, 13, 22, 50};
		int size = x.length + y.length;
		int[] z = new int[size];
		int index = 0;
		boolean flag = true;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < y.length; j++)
			{
				if(x[i] == y[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				z[index++] = x[i];
			}
			else
			{
				flag = true;
			}
		}
		for(int i = 0; i < y.length; i++)
		{
			for(int j = 0; j< x.length; j++)
			{
				if(y[i] == x[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				z[index++] = y[i];
			}
			else
			{
				flag = true;
			}
		}
		int[] p = new int[index];
		for(int i = 0; i < index; i++)
		{
			p[i] = z[i];
		}
		System.out.println("x:" + Arrays.toString(x));
		System.out.println("y:" + Arrays.toString(y));
		System.out.println("z:" + Arrays.toString(z));
		System.out.println("p:" + Arrays.toString(p));
	}
}
