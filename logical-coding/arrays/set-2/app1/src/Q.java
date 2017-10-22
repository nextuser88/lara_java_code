// To sort array elements.
class  Q
{
	public static void main(String[] args) 
	{
		int[] array = {10, 2, 5, 3, 13, 7, 20, 15};
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		int n = array.length;
		int x;
		
		for(int i = 0; i< n-1; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				
				if(array[j]>array[j+1])
				{
					x = array[j];
					array[j] = array[j+1];
					array[j+1] = x;
					
				}
				
			}
		}
		for(int i = 0; i< array.length; i++)
		{
			System.out.print(array[i]+ ", ");
		}
	}
}
