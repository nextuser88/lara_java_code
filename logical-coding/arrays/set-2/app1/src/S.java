// Write a program for linear search.
class S
{
	public static void main(String[] args) 
	{
		int[] x = {12, 30, 40, 11, 23, 50, 3, 5, 70};
		int i = search(x, 70);
		System.out.println(i);
	}
	public static int search(int[] x, int element)
	{
		
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == element)
			{
				return i;
				
			}
						
		}

		return -1;
	}
}
