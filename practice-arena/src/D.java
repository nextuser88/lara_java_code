class D 
{
	static int totalSum(int n)
	{
		return (n*(n+1))/2;
	}
	static int arraySum(int a[])
	{
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		 return sum;
	}
	public static void main(String[] args) 
	{
		int n = 8;
		int[] a = {1,2, 4, 5, 6,7,8};
		int totalSum = totalSum(n);
		int arraySum =  arraySum(a);
		int missingNumber = totalSum- arraySum;
		System.out.println("missing number : " + missingNumber);
	}
}
