class Z
{
	static
	{
		Z z1 = new Z();
		System.out.println("SIB begin");
		Z z2 = new Z();
		System.out.println("SIB end");
	}
	
	
	Z()
	{
		
		System.out.println("Z()");
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		Z obj1 = new Z();
		System.out.println("main end");
	}
}