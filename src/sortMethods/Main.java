package sortMethods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {3, 4, 7, 2, 3, 1}; 
		
		int[] list1 = {1,2,3,9}; 
		int[] list2 = {5,6,7,8}; 
		
//		BubbleSort.bubbleOrder(array);
//		System.out.println(Arrays.toString(array));
		
//		SelectionSort.selection(array);
//		System.out.println(Arrays.toString(array));
		
//		InsertionSort.insertOrder(array);
//		System.out.println(Arrays.toString(array)); 
		
		int [] combined = MergeSort.mergeSort(list1, list2); 
		System.out.println(Arrays.toString(combined)); 
		
		int[] quickArray = {6,7,5,2,3,4,8}; 
		QuickSort.quickSort(quickArray, 0, quickArray.length-1);
		System.out.println(Arrays.toString(quickArray)); 


	}

}
