class  Triangle3
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int value = 1;
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print(value++ + " ");
			}
			System.out.println();
		}
	}
}
