class L // class L extends Object
{
	L()
	{
		// super();
		System.out.println("L()");
	}
}

class M extends L
{
	M()
	{
		// super();
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		// super();
		System.out.println("N()");
	}
}
class O // class O extends Object
{
	

	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println("------");
		M obj2 = new M();
		System.out.println("-------");
		N obj3 = new N();
		System.out.println("-------");
	}
}
