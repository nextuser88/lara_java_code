class G 
{
	class H
	{
	}
	static class I
	{
	}
	public static void main(String[] args) 
	{
		H h1 = null;
		I i1 = null;
		//h1 = new H();
		i1 = new I();//1
		h1 = new G().new H();
		G g1 = new G();
		h1 = g1.new H();
		i1 = new G.I();//2
		System.out.println("done!");
	}
}
