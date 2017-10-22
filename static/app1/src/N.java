class N
{
	static int i = 10;
	
	public static void main(String[] args) 
	{
		int i =20;

		System.out.println(i);// If local and global having same name preference will be given to local var.
		System.out.println(N.i);
	}
}
