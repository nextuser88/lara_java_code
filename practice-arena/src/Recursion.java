class Recursion 
{
	public static int findMax(int[] A, int startIndex)
	{
		if(startIndex == A.length-1)
		{
			return A[startIndex];
		}
		else
		{
			return Math.max(A[startIndex], findMax(A, startIndex+1));

		}
	}
	public static void main(String[] args) 
	{
		int[] A = {3,4,56,7,6,6,5,8,6,7};
		System.out.println("Max = " + findMax(A, 0));
	}
}
