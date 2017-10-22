// Write a program which has to reverse an element of an array?
class E 
{
	public static void main(String[] args) 
	{
		int[] x = {1, 2, 5, 9, 4, 10, 20, 50};

		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+", ");
		}
		System.out.println();

		for(int i = 0; i < x.length/2; i++)
		{
			int temp = x[i];
			x[i] = x[x.length-i-1];
			x[x.length-i-1] = temp;
		}

		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}

		
}
