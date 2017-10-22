class  Pyramid3		
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int odd = 2*rows-1;
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=(i-1); j++)
			{
				
				System.out.print(" ");
								
			}	
			
			for(int k =1; k<=odd; k++)
			{
											
				System.out.print("*");	
			}
			System.out.println();
			odd -=2;
		}
		
	}
}
