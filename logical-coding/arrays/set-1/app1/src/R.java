// How to find out maximum value from an int array?
class  R
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		int max = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println(max);
	}
}
