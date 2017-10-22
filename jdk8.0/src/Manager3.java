interface D
{
	void test1();
}
class  Manager3
{
	public static void main(String[] args) 
	{
		D d1 = () -> System.out.println("from test1");
		d1.test1();
		System.out.println("----------");
		D d2 = () -> {
			System.out.println("from test1");
			System.out.println("from test1");
		};
		d2.test1();
		System.out.println("----------");
		D d3 = () -> {
			System.out.println("from test1");
		};
		d3.test1();
		System.out.println("----------");
	}
}
