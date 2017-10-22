class P
{
	int i;
}
class Q extends P
{
	int j;
}
class  R extends Q
{
	int k;
}
class Manager271
{

	public static void main(String[] args) 
	{
		P p1 = new Q();
		System.out.println(p1.i);
		//System.out.println(p1.j);
		Q q1 = (Q)p1;
		System.out.println(q1.j);
		P p2 = new R();
		System.out.println(p2.i);
		//System.out.println(p2.j);
		//System.out.println(p2.k);
		Q q2 = (Q)p2;
		System.out.println(q2.j);
	}
}
