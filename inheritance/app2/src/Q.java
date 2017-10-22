class  Q
{

	Q()
	{
		//1.super();
		//2.call to IIB
		System.out.println("Q()");
		
	}
	{
		System.out.println("Q-IIB");
	}
}
class R extends Q
{


	R()
	{
		//1.super();
		//2.call to IIB
		System.out.println("R()");
		
	}

	{
		System.out.println("R-IIB");
	}
}
class S extends R
{


	S(int i)
	{
		//1.super();
		//2.call to IIB.
		System.out.println("S(int)");
		
	}

	{
		System.out.println("S-IIB");
	}


	public static void main(String[] args) 
	{
		
		S s1 = new S(90);
		System.out.println("--------");
		R r1 = new R();
		System.out.println("--------");
		Q q1 = new Q();
		System.out.println("--------");
		
	}
}
 
