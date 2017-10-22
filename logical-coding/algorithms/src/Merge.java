class  Merge
{
	private int[] array;
	private int[] tempArray;
	int length;
	
	public static void main(String[] args) 
	{
		int[] inputArray = {10, 2, 3, 7, 1, 5, 9};
		Merge obj = new Merge();
		obj.sort(inputArray);
		for(int i = 0; i < inputArray.length; i++)
		{
			System.out.print(inputArray[i]+"\t");
		}
	}
	public void sort(int inputArray[])
	{
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempArray = new int[length];
		doMergeSort(0, length-1);
	}
	public void doMergeSort(int li, int hi)
	{
		if(li < hi)
		{
			int mid = li + (hi-li)/2;
			doMergeSort(li, mid);
			doMergeSort(mid+1, hi);
			doMergeParts(li, mid, hi);
		}
	}
	public void doMergeParts(int low, int middle, int high)
	{
		for(int i = low; i <= high; i++)
		{
			tempArray[i] = array[i];
		}
		
		int i = low;
		int j = middle+1;
		int k = low;

		while(i <= middle && j <= high)
		{
			if(tempArray[i] <= tempArray[j])
			{
				array[k] = tempArray[i];
				i++;
			}
			else
			{
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}

		while(i <= middle)
		{
			array[k] = tempArray[i];
			i++;
			k++;
		}
		
	}
}
