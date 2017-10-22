package pack1;

class B
{
	private int i;//  private members within the class.

	
}

class C

{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);// calling private members outside the class. NOT ALLOWED
	}
}