@FunctionalInterface
interface I
{
	void test1();
}
class  Manager8
{
	public static void main(String[] args) 
	{
		I obj = () -> System.out.println("from test1");
		obj.test1();
	}
}
