package com.lara;
public class LinkedList
{
	private Element front, back;
	public void add(Object o1)
	{
		Element e = new Element();
		e.data = o1;
		if(front == null)
		{
			front = e;
		}
		else
		{
			back.next = e;
		}
		//e.prev = back;
		back = e;
		//back.next = front;//circular
		//front.prev = back//circular
	}

	/*public void iterate()
	{
		Element e = front;
		while(e != null)
		{
			System.out.println(e.data);
			e = e.next;
		}
	}*/

	public void reverseIterate()
	{
		Element e = back;
		while(e != null)
		{
			System.out.println(e.data);
			e = e.prev;
		}
	}
	class Element
	{
		Element next;
		//Element prev;
		Object data;
	}
}