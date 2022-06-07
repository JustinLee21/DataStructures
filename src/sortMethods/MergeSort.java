package sortMethods;

public class MergeSort {
	//Argument int arrays have to be sorted
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		int[] newArray = new int [arr1.length + arr2.length]; 
		int index = 0; 
		int i = 0; 
		int j = 0; 
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				newArray[index] = arr1[i]; 
				index++; 
				i++; 
			}else {
				newArray[index] = arr2[j]; 
				j++; 
				index++; 
			}
		}
		while(i < arr1.length) {
			newArray[index]= arr1[i]; 
			index++; 
			i++; 
		}
		while(j < arr2.length) {
			newArray[index]= arr1[j]; 
			index++; 
			j++; 
		}
		return newArray; 
	}
	
}
