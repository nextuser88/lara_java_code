class  Triangle6
{
	public static void main(String[] args) 
	{
		int rows = 5;
		
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=(rows-i+1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// As i is increasing no. of stars decreasing.