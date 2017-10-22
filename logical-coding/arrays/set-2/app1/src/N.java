//Write a program for binary search in an array?
public class  N
{
	public static void main(String[] args) 
	{
		int[] x = {3, 9, 20, 45, 50, 200, 401, 500, 600, 808, 909};
		int i = binarySearch(x,50);
		System.out.println(i);

	}
	private static int binarySearch(int[] x, int element)
	{
		int index = -1;
		int begin = 0;
		int end  = x.length-1;
			
		while(end >= begin)
		{
			int mid = (begin+end)/2;
			if(x[mid] == element)
			{
				index = mid;
				break;
			}
			if(x[mid] > element)
			{
				end = mid - 1;
			}
			else
			{
				begin = mid + 1;
			}
		}
		if(index == -1)
		{
			if(element < x[0])
			{
				return index;
			}
			int j = -1;
			for(int i = 0; i< x.length; i++)
			{
				j--;
				if(x[i]<element && x[i+1]> element)
				{
					break;
				}
			}

			if(element > x[x.length-1])
			{
				j--;
			}
		}
		return index;		
	}
}
