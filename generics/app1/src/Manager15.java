class W<A>
{
	A i;
}
class  Manager15
{
	public static void main(String[] args) 
	{
		W<?> obj1 = new W<Integer>();
		//obj1.i = 10;
		obj1 = new W<String>();
		//obj1.i = "abc";
		obj1 = new W<Double>();
		//obj1.i = "20.90";
		W<Integer> obj2 = new W<Integer>();
		obj2.i  = 1000;
		W<? extends Number> obj3 = new W<Integer>();
		obj3  = new W<Integer>();
		//obj3.i  = 10;
		//obj3.i  = new Integer();
		W<? super Number> obj4 = null;
		obj4  = new W<Number>();
		obj4.i = 10;
		W<? super Q> obj5 = null;
		obj5 = new W<Q>();
		obj5.i  = new R();
		obj5.i  = new S();
		//obj5.i  = new P();
		//obj5.i  = new Object();
		W<? extends P>obj6 = null;
		obj6  = new W<R>();
		//obj6.i  = new S();
		W<?> obj7 = null;
		obj7 = new W<S>();
		//obj7.i  = new S();
		System.out.println("Hello World!");
	}
}
