package sortMethods;

public class SelectionSort {
	public static void selection(int [] array) {
		for(int i = 0; i < array.length; i++) {
			int minValue = i; 
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < array[minValue]) {
					minValue = j; 
				}
			}
			if(i != minValue) {
				int temp = array[i]; 
				array[i] = array[minValue]; 
				array[minValue] = temp;
			}
		}
	}
}
