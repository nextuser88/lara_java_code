class Z
{
	Boolean test()
	{
		return true;
	}
}
class Manager102 
{
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		Z z2 = new Z();
		Z z3 = new Z();
		Z z4 = new Z();
		Boolean b1 = z1.test();
		Boolean b2 = z2.test();
		Boolean b3 = z3.test();
		Boolean b4 = z4.test();
		System.out.println("done");
	}
}
