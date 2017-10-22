class  P
{
	static boolean contains(int[] a, int element, int index)
	{
		if(index == a.length)
		{
			return false;
		}
		if(a[index] == element)
		{
			return true;
		}
		return contains(a, element, ++index);
	}
	public static void main(String[] args) 
	{
		int x[] = {1, 2, 3, 4, 5, 7, 8, 9};
		boolean flag1 = contains(x, 4, 0);	
		System.out.println("element contains in the array " + flag1);
	}
}
