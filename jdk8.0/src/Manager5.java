interface F
{
	void test1(int a, int b);
}
class  Manager5
{
	public static void main(String[] args) 
	{
		F f1 = (i, j) -> System.out.println("from test1: " + i + ", " + j);
		f1.test1(2,3);
		System.out.println("------------------");
		F f2 = (int i, int p) -> {
			System.out.println("from test1: " + i + ", " + p);
			System.out.println("from test1: " + i + ", " + p);
		};
		f2.test1(20,30);
		System.out.println("------------------");
		/*
		F f3 = p, q -> {
			System.out.println("from test1: " + p + ", " + q);
			System.out.println("from test1: " + p + ", " + q);
		};
		f3.test1(20,30);
		System.out.println("------------------");
		*/
	}
}
