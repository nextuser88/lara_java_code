class W
{
	static
	{
		
		System.out.println("S.I.B");
	}
	
	W()
	{
		
		System.out.println("W()");
		
	}
	
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("--------");
		W w2 = new W();
		System.out.println("--------");
	}
}
