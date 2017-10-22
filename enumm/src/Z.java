class Z
{
	enum B
	{
		con1(10),con2(30), con4(50);
		
		int i;
		
		B(int i)
		{
		this.i = i;
		}
		
	}


	public static void main(String[] args) 
	{
		B b1 = B.con4;
		System.out.println(b1);	
		System.out.println(b1.i);	
		System.out.println("----------");	
		B b2 = B.con2;
		System.out.println(b2);	
		System.out.println(b2.i);	
		
	}
}
