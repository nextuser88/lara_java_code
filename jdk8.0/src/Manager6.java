interface G
{
	int test1();
}
class  Manager6
{
	public static void main(String[] args) 
	{
		G g1 = () -> 10;// if only one statement then straightaway return the specified value.
		System.out.println(g1.test1());
		System.out.println("--------");
		G g2 = () -> {
			System.out.println("from test1");
			return 20;// now return keyword is mandatory.
		};
		System.out.println(g2.test1());
		System.out.println("--------");

		/*G g3 = () -> return 10;
		System.out.println(g3.test1());
		System.out.println("--------"); compile time error*/
	}
}
