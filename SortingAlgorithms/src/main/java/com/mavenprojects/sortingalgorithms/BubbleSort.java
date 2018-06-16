package com.mavenprojects.sortingalgorithms;

public class BubbleSort implements SortingAlgorithm
{
	private int[] array;
	
	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return this.array;
	}
	
	public void sort() 
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-i-1; j++)
			{
				//Comparing elements
				if (array[j] > array[j+1])
                {
					//Swapping elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
			}
		}
	}
	
	public String displayArray() 
	{
		String ans = "";
		for(int i=0; i<this.array.length; i++)
		{
			if(i!=this.array.length-1)
				ans+=this.array[i]+", ";
			else
				ans+=this.array[i];
		}
		return ans;
	}

}
