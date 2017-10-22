class Y
{
	enum A
	{
		con1,con2(90),con3, con4("ABC");

		A()
		{
		System.out.println("A()");
		}
		A(int i)
		{
		System.out.println("A(int):"+ i);
		}
		A(String s1)
		{
		System.out.println("A(string):"+ s1);
		}
	}


	public static void main(String[] args) 
	{
		A a1 = A.con4;
		System.out.println("----------");	
		System.out.println(a1);	
		
	}
}
