/* How to read first half odd index and second half 
   even index elements seperately?*/
class  P
{
	public static void main(String[] args) 
	{
		int[] x = {10, 2, 5, 3, 9, 2, 8, 10, 11, 20, 10, 2, 5, 3, 9, 2, 8, 10, 11, 20};

		int mid = (x.length/2);
		
		for(int i = 1; i < mid; i += 2)
		{
			System.out.println(x[i]);
		}
		System.out.println("--------------");
		
		if(mid%2 != 0)
		{
			mid++;
		}
		for(int j = mid; j < x.length; j += 2)
		{
			System.out.println(x[j]);
		}
		
	}
}
