//Write a program to develop 3rd array with the common elements of the two given array?
import java.util.Arrays;
class  E
{
	public static void main(String[] args) 
	{
		int[] x = {10, 23, 30, 11, 10, 10, 10, 10, 22};
		int[] y = {10, 21, 30, 13, 22, 50};
		int size = x.length > y.length ? y.length : x.length;
		int[] z = new int[size];
		int index = 0;
		boolean flag = true;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < y.length; j++)
			{
				if(x[i] == y[j])
				{
					for(int k = 0; k < index; k++)
					{
						if(z[k] == x[i])
						{
							flag = false;
							break;
						}
					}
					if(flag)
					{
						z[index++] = x[i];
						break;
					}
					else
					{
						flag = true;
						break;
					}
				}
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
