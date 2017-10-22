import java.util.Arrays;
/*QuickSort*/
class  A
{
	public static void main(String[] args) 
	{
		int[] x = {13,9,2,4,15,3,17,1,5,11,6,8};

		System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length-1;
		quicksort(x,low,high);
		System.out.println(Arrays.toString(x));
	}

	public static void quicksort(int[] arr, int low, int high)
	{
		if(arr == null || arr.length == 0)
		{
			return;
		}

		if(low >= high)
		{
			return;
		}
		// pick the pivot.
		int middle = low + (high-low)/2;
		int pivot = arr[middle];

		//make left < pivot and right > pivot.

		int i = low, j= high;

		while(i <= j)
		{
			while(arr[i] < pivot)
			{
				i++;
			}

			while(arr[j]>pivot)
			{
				j--;
			}

			if(i<=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if(low<j)
		{
		
			quicksort(arr,low,j);
		}
		if(high>i)
		{
			quicksort(arr,i,high);
		}
	}
}
