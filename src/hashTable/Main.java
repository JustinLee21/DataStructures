package hashTable;

public class Main {

	public static void main(String[] args) {
		HashTable hash1 = new HashTable(); 
		
		hash1.set("nails", 100);
		hash1.set("bolt", 50);
		hash1.set("hammer", 75);
		hash1.set("lumber", 500);
		hash1.set("bolts", 155);
		hash1.set("screws", 32);
		
		hash1.printHashTable();
		
		System.out.println(hash1.get("nails")); 
		System.out.println(hash1.getKeys()); 
		
		int[] data1 = {1,2,3,4}; 
		int[] data2 = {5,6,7}; 
		System.out.println(hash1.validateIfVisible(data1, data2));  

	}

}
