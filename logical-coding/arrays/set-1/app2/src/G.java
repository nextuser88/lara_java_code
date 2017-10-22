//program which has to leftrotate one element in the array.
class  G
{
	public static void main(String[] args) 
	{
		int[] x = {11, 20, 30, 10, 22, 45,48, 20};
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();

		int temp = x[0];
		for(int i = 1; i < x.length; i++)
		{
			x[i-1] = x[i];
		}

		x[x.length-1] = temp;
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
				
	}
}
