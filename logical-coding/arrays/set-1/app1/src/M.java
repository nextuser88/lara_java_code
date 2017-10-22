// How to read only odd indexed element of an array?
class  M
{
	public static void main(String[] args) 
	{
		int[] x = {10, 22, 33, 77, 10, 30, 11, 3, 1, 5};

		for(int i = 1; i < x.length; i += 2)
		{
			System.out.println(x[i]);
		}
		
	}
}
