// To remove duplicates in an array.
class  P
{
	public static void main(String[] args) 
	{
		int[] x = {10, 11, 23, 25, 22, 30, 10, 11, 25, 22, 10, 23, 25, 10};
		
		int end = x.length;
		for(int i = 0; i < end; i++)
		{
			System.out.print(x[i]+ ", ");
		}
		
		System.out.println();
		for(int i = 0; i < end; i++)
		{
			for(int j = i+1; j < end; j++)
			{
				if(x[i] == x[j])
				{
					int temp = j;
					for(int k = j+1; k < end; k++, temp++)
					{
						x[temp] = x[k];
					}
					end--;
					//j--;
				}
			}
			
		}
		/*int[] y = new int[end];
		for(int i = 0; i< end; i++)
		{
			y[i] = x[i];
		}*/
		for(int i = 0; i < end; i++)
		{
			System.out.print(x[i] + ", ");
		}
	}
}
