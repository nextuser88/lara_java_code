// Find out the sequential three indexes, where sum of first and second is third?
class A 
{
	public static void main(String[] args) 
	{
		int[] x = {1, 2, 3, 2, 3, 5, 11, 13, 24};
		int a,b,c;
		for(int i = 0; i < x.length-2; i++)
		{
			if((x[i]+x[i+1]) == x[i+2])
			{
				System.out.println("the sequential three indices are : " + "index: " + i + " value "+ x[i] 
					+ " index:" + (i+ Integer.parseInt("1")) + " value " + x[i+1] + " index " + (i+ Integer.parseInt("2")) + " value: " + x[i+2]);
			}
		}
		System.out.println("done");
	}
}
