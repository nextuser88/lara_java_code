class py
{
	public static void main(String[] args)
	{
		int rows =11;
		int cols = rows/2+1;
		int stars = 0;
		for(int i=1;i<=rows;i++)
		{
			if(i<=cols)
			{
				stars++;
				for(int j=1;j<=stars;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				stars--;
				for(int k=1;k<=stars;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}