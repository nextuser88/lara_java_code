/* How to read first half even indexed and second half 
   odd indexed elements seperately?*/
class  Q
{
	public static void main(String[] args) 
	{
		int[] x = {10, 2, 5, 3, 9, 2, 8, 10, 11, 20, 10, 2, 5, 3, 9, 2, 8, 10, 11, 20};

		int mid = (x.length/2);
		
		for(int i = 0; i < mid; i += 2)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
		System.out.println("--------------");
		
		if(mid%2 != 0)
		{
			mid++;
		}
		for(int j = mid; j < x.length; j += 2)
		{	
			System.out.print(x[j] + ", ");
		}
		
	}
}
