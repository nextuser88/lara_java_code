// To swap odd indexed elements with even indexed elements.
class  O
{
	public static void main(String[] args) 
	{
		int[] x = {10, 2, 5, 4, 2, 6};
		int temp = 0;
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+ ", ");
		}

		System.out.println();
		for(int i = 0; i < x.length; i+=2)
		{
			temp = x[i];
			x[i] = x[i+1];
			x[i+1] = temp;
		}

		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
	}
}
