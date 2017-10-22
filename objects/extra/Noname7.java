class B
{
	int i;
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.i = 20;
		b1 = new B();
		b1.i = b1;
		System.out.println(b1.i);
	}
}
