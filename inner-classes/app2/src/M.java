class M 
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
				System.out.println("111");
				System.out.println("111");
				System.out.println("111");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("---");
		a1.test();
		System.out.println("---");
		a1.test();
		
	}
}
