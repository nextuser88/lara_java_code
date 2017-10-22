// Sequential 3 indexes where differences of the first two should be same as third?
class  C
{
	public static void main(String[] args) 
	{
		int x[] = {4, 3, 1, 2, 0, 2, 3, 1, 2, 10};
		int a,b,c;
		int size = x.length;
		for(int i = 0; i < size-2; i++)
		{
			a = x[i];
			b = x[i+1];
			c = x[i+2];

			if((a-b) == c)
			{
				System.out.print(i + ", ");
				System.out.print((i+1) + ", ");
				System.out.println((i+2));
			}
		}
		System.out.println("Hello World!");
	}
}
