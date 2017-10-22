import java.util.ArrayList;
class  ReplaceElement
{
	public static void main(String[] args) 
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		arrayList.set(1,"REPLACED ELEMENT");
		System.out.println("Array List contains..");
		for(int i = 0; i < arrayList.size(); i++)
		{
			System.out.println(arrayList.get(i));
		}
	}
}
