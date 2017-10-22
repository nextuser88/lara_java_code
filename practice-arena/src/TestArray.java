class TestArray 
{
	static void min(int arr[])
	{
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			System.out.print(min + " ");
		}
	}
	public static void main(String[] args) 
	{
		int z[] = {33, 4, 5 , 1};
		min(z);
	}
}
