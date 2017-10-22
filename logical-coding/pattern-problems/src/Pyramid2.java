class  Pyramid2
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int odd = 1;
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=(rows - i); j++)
			{
				
				System.out.print(" ");
				
				
			}
			int m = 0;
			for(int k =1; k<=odd; k++)
			{
				if(k<=i)
				{
					m++;
				}
				else
				{
					m--;
				}
							
				System.out.print(m);	
			}
			System.out.println();
			odd +=2;
		}
		
	}
}
