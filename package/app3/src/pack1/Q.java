package pack1;
class Q
{
	private Q()
	{
		System.out.println("Q()");
	}
}

class R extends Q
{
	/*
		R()
		{
			super(); 
		}

		super() calling stmt giving call to super call construtor which is private.We cannot call private members inside subclass.
	*/

	public static void main(String[] args) 
	{

		System.out.println("done");
	}

}