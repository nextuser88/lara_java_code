interface H
{
	int test1(int i);
}
class  Manager7
{
	public static void main(String[] args) 
	{
		H h1 = i -> i * i;
		System.out.println(h1.test1(2));
		System.out.println("------------");
		H h2 = i -> {
			System.out.println("from test1");
			return i * i;
		};
		System.out.println(h2.test1(3));
		System.out.println("------------");
		H h3 = (int p) -> {
			System.out.println("from test1");
			return p * 5;
		};
		System.out.println(h3.test1(2));
		System.out.println("------------");
	}
}
