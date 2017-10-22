class  J
{
	public static void main(String[] args) 
	{
		int[] x = {10, 2, 5, 1, 0, 12, 13, 15, 18, 6};
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
		for(int i = 0; i < x.length; i++)
		{
			y[x[i]] = 1;
		}
		for(int i = 0; i < y.length; i++)
		{
			if(y[i] == 0)
			{
				System.out.print(i + ", ");
			}
		}
		
	}
}
