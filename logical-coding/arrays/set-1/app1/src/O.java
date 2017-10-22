// How to read first half and second half elements seperately?
class  O
{
	public static void main(String[] args) 
	{
		int[] x = {10, 22, 33, 77, 10, 30, 11, 3, 1, 5};
		int mid = x.length/2;
		System.out.println("first half");
		for(int i = 0; i < mid; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("--------------");
		System.out.println("Second half");
		for(int j = mid; j < x.length; j++)
		{
			System.out.println(x[j]);
		}
		
	}
}
