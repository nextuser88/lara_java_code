class E extends Thread
{

}
class F 
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.getName());
		e1.setName("abc");
		System.out.println(e1.getName());
	}
}
