interface E
{
	void test1(int i);
}
class  Manager4
{
	public static void main(String[] args) 
	{
		E e1 = (i) -> System.out.println("from test1: " + i);
		e1.test1(20);
		System.out.println("---------------");
		E e2 = (n) -> {
			System.out.println("from test1: " + n);
			System.out.println("from test1: " + n);
		};
		e2.test1(30);
		System.out.println("---------------");
		// parameter is optional if only 1 paramaeter. if multiple parameters then paranthesis is compulsory.
		E e3 = p -> {
			System.out.println("from test1: " + p);
			System.out.println("from test1: " + p);
		};
		e3.test1(40);
		System.out.println("------------------");
		E e4 = (int q) -> {
			System.out.println("from test1: " + q);
			System.out.println("from test1: " + q);
		};
		e4.test1(50);
		System.out.println("------------------");
	}
}
