class X
{
	enum A
	{
		con(100),Test(200);

		A(int i)
		{
		System.out.println("A(int):" +  i);
		}
	}


	public static void main(String[] args) 
	{
		A a1 = A.Test;
		System.out.println(a1);	
		
	}
}
