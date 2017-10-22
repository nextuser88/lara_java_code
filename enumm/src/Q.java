enum P
	{
		c1,c2,c3;
	}
class Q
{

	public static void main(String[] args) 
	{
		P p1 = P.valueOf("c2");		
		System.out.println(p1);
		P p2 = P.valueOf("c3");		
		System.out.println(p2);
		//P p3 = P.valueOf("c4");		
		//System.out.println(p3);
		
	}
}
