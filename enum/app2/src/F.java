import java.util.EnumSet;
enum D
{
	abc, xyz, test;
}
enum E
{
	con1, con2, con3;
}
public class F 
{
	public static void main(String[] args) 
	{
		EnumSet set1= EnumSet.of(D.abc, D.xyz);
		for(Object en: set1)
		{
			System.out.println(en);
		}
		EnumSet set2= EnumSet.of(E.con2, E.con1);
		for(Object en: set2)
		{
			System.out.println(en);
		}
		
	}
}
