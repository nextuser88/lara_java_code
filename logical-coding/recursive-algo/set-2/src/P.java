class P 
{
	static boolean contains(int[] x, int element, int index)
	{
		if(index == x.length)
		{
			return false;
		}
		if(x[index] == element)
		{
			return true;
		}
		return contains(x,element,index+1);
	}
	public static void main(String[] args) 
	{
		int[] x={1,3,4,5,6,7,89,4};
		boolean flag1 = contains(x,4,0);
		System.out.println(flag1);
		boolean flag2 = contains(x,89,0);
		System.out.println(flag2);
	}
}
