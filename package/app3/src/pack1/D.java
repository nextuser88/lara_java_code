package pack1;
class D 
{
	private void test()
	{
		System.out.println("test");
	}
}

class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();// private test() method can not be used ooutside D.
		d1.test();
		System.out.println("done");
	}
}
