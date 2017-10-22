import java.util.*;

class Xyz 
{
	public static void main(String[] args) 
	{
		Vector s1 = new Vector();
		for(int i = 0; i < 10; i++)
		{
			s1.addElement(i);
		}
		Enumeration e = s1.elements();
		System.out.println(s1.toString());
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println(s1);

	}
}
