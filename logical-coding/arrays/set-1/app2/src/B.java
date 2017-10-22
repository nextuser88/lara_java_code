// double of the left side element should be same as corresponding right side elements.

class B 
{
	public static void main(String[] args) 
	{
		int[] x = {1, 4, 2, 5, 6, 8, 25, 4, 15, 1};
		int mid = x.length/2;
		int size = x.length;
		for(int i = 0; i < mid; i++)
		{
			if(x[i]*x[i] == x[(size--)-1])
			{
				System.out.println(i);
			}
		}
		
	}
}
