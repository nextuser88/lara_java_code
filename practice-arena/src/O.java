class O 
{
	static int arraySum(int[] x, int index)
	{
		if(index == x.length)
		return 0;
		return x[index] + arraySum(x , ++index);
	}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		int index = 0;
		System.out.println("sum of array elements " + arraySum(a, index));
	}
}
