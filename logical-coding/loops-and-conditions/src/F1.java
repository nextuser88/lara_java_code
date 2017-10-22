class F1 
{
	public static void main(String[] args) 
	{
		int i =0;
		int j =1;
		int k =0;
		long sum = i+j;
		for(int m =3;m<=40;m++)
		{
			k = i+j;
			sum +=k;
			i=j;
			j=k;
		}
		System.out.println("sum of 100 fib no: "+ sum);
	}
}
