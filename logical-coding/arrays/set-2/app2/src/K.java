import java.util.Arrays;
class K 
{
	public static void main(String[] args) 
	{
		int[] x = {6, 10, 8, 15, 13, 18, 16};
		int max, min;
		max = min = x[0];
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		int[] y = new int[(max - min) + 1];
		for(int j = 0, i = min; j < y.length; i++, j++)
		{
			y[j] = i;
		}
		boolean flag = false;
		for(int i = 0; i < y.length; i++)
		{
			for(int j = 0; j < x.length; j++)
			{
				if(y[i] == x[j])
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				y[i] = min - 1;
				flag = false;
			}
		}

		for(int i = 0; i < y.length; i++)
		{
			if(y[i] != (min-1))
			{
				System.out.print(y[i] + ", ");
			}
		}
	}
}
