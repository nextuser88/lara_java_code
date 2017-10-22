// Write a program to right rotate 2 elements//
class  M
{
	public static void main(String[] args) 
	{
		int[] x = {11, 20, 30, 10, 22, 45, 48, 20};

		for(int i = 0; i< x.length; i++)
		{
			System.out.print(x[i]+ ", ");
		}

		System.out.println();
		int temp1 = x[x.length-1];
		int temp2 = x[x.length-2];

		for(int i = x.length-1; i>1; i--)
		{
			x[i] = x[i-2];			
		}

		x[0] = temp2;
		x[1] = temp1;

		for(int i = 0; i< x.length; i++)
		{
			System.out.print(x[i]+ ", ");
		}
	}
}
