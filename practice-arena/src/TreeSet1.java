import java.util.*;

class TreeSet1 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new TreeSetDemo());
		t1.add(2);
		t1.add(4);
		t1.add(0);
		t1.add(6);
		t1.add(5);
		t1.add(9);
		t1.add(7);
		System.out.print(t1 + " ");
	}
}
class TreeSetDemo implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		if(i1 > i2)
		{
			return -1;
		}
		else if(i1 < i2)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
}
