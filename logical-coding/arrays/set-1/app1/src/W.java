// How to find out average of an even indexed and odd indexed elements seperately?
class  W
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		double sum = 0, total = 0;
		for(int i = 0; i < x.length; i += 2)
		{
			sum += x[i];
			total++;
		}		
		double avg = sum/total;	
		System.out.println("even indexed avg: " + avg);

		sum = 0.0;
		avg = 0.0;
		total = 0.0;
		for(int i = 1; i < x.length; i += 2)
		{
			sum += x[i];
			total++;
		}		
		avg = sum/total;	
		System.out.println("odd indexed avg: " + avg);			

	}
}
