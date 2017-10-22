// find out the index of an array left element sum should be same as right element sum?
class  D
{

	public static void main(String[] args) 
	{
		//int[] a = {2, 4, 4, 5, 4, 1};
		int[] a = {2, 4, 4, 2, 4, 7, 4, 5};
		int endIndex = a.length-1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;

		while(true)
		{
			if(sumLeft > sumRight)
			{
				sumRight += a[endIndex--];
			}
			else
			{
				sumLeft += a[startIndex++];
			}

			if(startIndex > endIndex)
			{
				if(sumLeft == sumRight)
				{
					System.out.println(endIndex);
				}
				else
				{
					System.out.println("doesn't have");
				}

				break;
			}
			
		}
		
	}
}
