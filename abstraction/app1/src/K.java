abstract class  K
{	
	abstract void method1();
	abstract void method2();
	abstract void method3();
	abstract void method4();
	
}
abstract class L extends K
{
	void method1()
	{
		System.out.println("from test1");
	}

	abstract void method5();
}
class M extends L
{
	void method2()
	{
		System.out.println("from test2");
	}
	void method3()
	{
		System.out.println("from test3");
	}
	void method4()
	{
		System.out.println("from test4");
	}
	void method5()
	{
		System.out.println("from test5");
	}

	public static void main(String[] args)
	{
		M m1 = new M();
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();
		m1.method5();
		System.out.println("done");
	
	}
}
