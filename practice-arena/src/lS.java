class lS
{
	public static int iterlinearSearch(int[] A, int soughtVal)
	{
		for(int i = 0; i < A.length; i++)
		{
			if(A[i] == soughtVal)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] A = {4,5,8,7,9,6,5};
		int search = 6;
		int i = iterlinearSearch(A, search);
		System.out.printf("the index of soughtValue is: %d ", i);
	}
}
