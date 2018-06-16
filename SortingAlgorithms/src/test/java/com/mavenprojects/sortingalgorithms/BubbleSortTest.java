package com.mavenprojects.sortingalgorithms;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void sortTest1() 
	{
		int[] input = new int[]{} ;
		int[] expectedOutput = new int[]{};
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		int[] receivedOutput = bubbleSort.getArray();
		
		assertTrue(Arrays.equals(receivedOutput, expectedOutput));
	}
	
	@Test
	public void sortTest2() 
	{
		int[] input = new int[]{2} ;
		int[] expectedOutput = new int[]{2};
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		int[] receivedOutput = bubbleSort.getArray();
		
		assertTrue(Arrays.equals(receivedOutput, expectedOutput));
	}
	
	@Test
	public void sortTest3() 
	{
		int[] input = new int[]{5, 4, 3, 2, 1} ;
		int[] expectedOutput = new int[]{1, 2, 3, 4, 5};
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		int[] receivedOutput = bubbleSort.getArray();
		
		assertTrue(Arrays.equals(receivedOutput, expectedOutput));
	}
	
	
	@Test
	public void sortTest4() 
	{
		int[] input = new int[]{1, -1, -3, 3, 2} ;
		int[] expectedOutput = new int[]{-3, -1, 1, 2, 3};
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		int[] receivedOutput = bubbleSort.getArray();
		
		assertTrue(Arrays.equals(receivedOutput, expectedOutput));
	}
	
	
	@Test
	public void displayArrayTest1()
	{
		int[] input = new int[]{2, 1, 3, 7};
		String expectedOutput = "1, 2, 3, 7";
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		String receivedOutput = bubbleSort.displayArray();
		
		assertEquals(receivedOutput, expectedOutput);
	}
	
	@Test
	public void displayArrayTest2()
	{
		int[] input = new int[]{1};
		String expectedOutput = "1";
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		String receivedOutput = bubbleSort.displayArray();
		
		assertEquals(receivedOutput, expectedOutput);
	}
	
	@Test
	public void displayArrayTest3()
	{
		int[] input = new int[]{};
		String expectedOutput = "";
		
		SortingAlgorithm bubbleSort = new BubbleSort();
		bubbleSort.setArray(input);
		bubbleSort.sort();
		String receivedOutput = bubbleSort.displayArray();
		
		assertEquals(receivedOutput, expectedOutput);
	}

}
