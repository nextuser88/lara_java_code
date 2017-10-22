//program which has to right rotate one element in the array.
class  I
{
	public static void main(String[] args) 
	{
		int[] x = {11, 20, 30, 10, 22, 45, 48, 20};

		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		int temp = x[x.length-1];
		for(int i = x.length-2; i >= 0; i--)
		{
			x[i+1] = x[i];
		}
		x[0] = temp;
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
				
	}
}
