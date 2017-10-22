// Find out an array left strength or right strength.
class  Y
{
	public static void main(String[] args) 
	{
		int[] x = {5, 6, 7, 8, 9, 9, 8, 6, 5, 4};
		int leftSum = 0, rightSum = 0;
		int mid = x.length/2;

		for(int i = 0; i < mid; i++)
		{
			leftSum += x[i];
		}
		
		for(int i = mid; i < x.length; i++)
		{
			rightSum += x[i];
		}
		if(leftSum > rightSum)
		{
			System.out.println("left side streanthly");			
		}
		else if(leftSum < rightSum)
		{
			System.out.println("right side streanthly");			
		}
		else
		{
			System.out.println("equal streanthly");			
		}	

	}
}
