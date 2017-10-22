// How to find out sum of elements of an int array?
class  T
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		int sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];	
		}
		System.out.println(sum);
	}
}
