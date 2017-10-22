// How to find out minimum value from an int array?
class  S
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		int min = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println(min);
	}
}
