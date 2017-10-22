// How to find out average of elements of an int array?
class  U
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		double sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];	
		}
		double avg = sum/x.length;	
		System.out.println(avg);
	}
}
