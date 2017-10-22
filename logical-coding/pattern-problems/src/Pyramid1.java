class  Pyramid1
{
	public static void main(String[] args) 
	{
		int rows = 11;
		int odd = 1;		
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=(rows - i); j++)
			{
				
				System.out.print(" ");
				
				
			}

			for(int k =1; k<=odd; k++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			odd +=2;
		}
		
	}
}
