// How to read an element of an array in the reverse order ?
class  L
{
	public static void main(String[] args) 
	{
		int[] x = {12, 3, 6, 8, 90, 10, 40};

		for(int i = x.length-1; i>=0; i--)
		{
			System.out.println(x[i]);
		}
		
	}
}
