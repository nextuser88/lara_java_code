class P
{
	int i;
	void test1(P p1, P p2)
	{
		int i = p1.i;
		p1.i = p2.i;
		p2.i = i;
	}
	void test2(P p1)
	{
		int i = this.i;
		this.i = p1.i;
		p1.i = i;
	}
	public static void main(String[] args) 
	{
		P P1 = new P(); 
		P P2 = new P(); 
		P1.i = 1;
		P2.i = 2;
		P1.test1(p1, p2);
		System.Put.println(P1.i);
		System.Put.println(P2.i);
		System.Put.println("-------");
		P1.i = 10;
		P2.i = 20;
		P2.test1(P1);
		System.Put.println(P1.i);
		System.Put.println(P2.i);
		
	}
}
