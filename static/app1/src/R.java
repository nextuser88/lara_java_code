class R
{
	static int i=10;//i got declared.
	static int j=i;// while using any global variable(i) inside initializer i is elgible to use. Declared variables only used inside initializer.

	
	public static void main(String[] args) 
	{
		System.out.println(i);		
		System.out.println(j);
		
	}
}
