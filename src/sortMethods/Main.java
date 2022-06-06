package sortMethods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {3, 4, 7, 2, 3, 1}; 
		
//		BubbleSort.bubbleOrder(array);
//		System.out.println(Arrays.toString(array));
		
		SelectionSort.selection(array);
		System.out.println(Arrays.toString(array));
		
//		InsertionSort.insertOrder(array);
//		System.out.println(Arrays.toString(array)); 


	}

}
