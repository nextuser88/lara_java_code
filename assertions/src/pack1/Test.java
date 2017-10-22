package pack1;
class  Q
{
	void test1()
	{
		System.out.println("test1-begin");
		S s1 = new S();
		s1.test2();
		assert false;
		System.out.println("test1-end");
	}
}
class S
{
	void test2()
	{
		System.out.println("test2-begin");
		T t1 = new T();
		t1.test3();
		assert false;
		System.out.println("test2-end");
	}
}
class T
{
	void test3()
	{
		System.out.println("test3-begin");
		U u1 = new U();
		u1.test4();
		assert false;
		System.out.println("test3-end");
	}
}
class U
{
	void test4()
	{
		System.out.println("test4-begin");
		V v1 = new V();
		v1.test5();
		assert false;
		System.out.println("test4-end");
	}
}
class V
{
	void test5()
	{
		System.out.println("test5-begin");
		assert false;
		System.out.println("test5-end");
	}
}
class R
{
	public static void main(String[] args)
	{
		System.out.println("main-begin");
		assert false;
		Q q1 = new Q();
		q1.test1();
		System.out.println("main-end");	
		
	}
}
