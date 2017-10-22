class I // class I extends Object
{
	I()
	{
		// super();
		System.out.println("I()");
	}
}

class J extends I
{
	J()
	{
		// super();
		System.out.println("J()");
	}
}
class K // class K extends Object
{
	

	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println("------");
		J obj2 = new J();
		System.out.println("-------");
	}
}
