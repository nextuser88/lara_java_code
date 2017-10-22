class A 
{
		private int i;
		public void setI(int i)
		{
			if(i == 9)
			{
				this.i = i;
			}
			else
			{
				System.out.println("you are not allowed to modify the value");	
			}
		}
		public int getI()
		{
			return i;
		}
		
}

public class B1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.setI(10);
		int i = a1.getI();
		System.out.println("Private value through getter method " + i);
	}
}