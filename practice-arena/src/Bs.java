class  Bs
{
	public static void main(String[] args) 
	{
		int n = 8;
		System.out.println("original no." + n);
		n = n << 1;
		System.out.println("left shift no." + n);
		n = -8;
		n = n >> 1;
		System.out.println("right shift no." + n);
		n = -8;
		n = n >>> 1;
		System.out.println("unsigned no. " + n);
	}
}
