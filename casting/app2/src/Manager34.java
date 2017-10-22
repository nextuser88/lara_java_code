class X
{
	int i;
	void test1()
	{
		System.out.println("X-test1");
	}
}
class Y extends X
{
	int j;
	void test2()
	{
		System.out.println("Y-test2");
	}
}
class Manager34
{
	public static void main(String[] args) 
	{
		Object obj1 = new X();
		obj1.test1();
		obj1.test2();
		Object obj2 = new Y();
		obj2.test1();
		obj2.test2();
		X x1 = new X();
		x1.test1();
		x1.test2();
		X x2 = new Y();
		x2.test1();
		x2.test2();
		Y y1 = new Y();
		y1.test1();
		y1.test2();
		obj1.i = 1;
		obj1.j = 1;
		obj2.j = 1;
		obj2.j = 1;
		x1.i = 1;
		x1.j = 1;
		x2.i = 1;
		x2.j = 1;
		y1.i = 1;
		y1.j = 1;
		System.out.println("done");
	}
}
