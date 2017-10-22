// How to read only even indexed element of an array?
class  N
{
	public static void main(String[] args) 
	{
		int[] x = {10, 22, 33, 77, 10, 30, 11, 3, 1, 5};

		for(int i = 0; i < x.length; i += 2)
		{
			System.out.println(x[i]);
		}
		
	}
}
