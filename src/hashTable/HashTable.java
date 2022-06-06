package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {
	private int size = 7; 
	private Node[] dataMap; 
	
	public HashTable(){
		this.dataMap = new Node[this.size]; 
	}
	
	class Node{
		private String key; 
		private int value; 
		private Node next; 
		Node(String key, int value) {
			this.key = key; 
			this.value = value; 
		}
	}
	
	public void printHashTable() {
		for(int i = 0; i < this.dataMap.length; i++) {
			System.out.print(i +":"+"\n"); 
			Node temp = dataMap[i]; 
			while(temp != null) {
				System.out.println("{"+ temp.key+ ": "+temp.value + "}");
				temp = temp.next; 
			}
			
		}
	}
	
	private int hash(String key) {
		int hash = 0; 
		char[] keyToChar = key.toCharArray(); 
		for(int i = 0; i < keyToChar.length; i++) {
			int asciiValue = keyToChar[i]; 
			//23 is a prime value and it allows more randomization for generation of indexes for hash table. 
			hash = (asciiValue + hash) * 23 % dataMap.length; 
		}
		return hash; 
	}
	
	public void set(String key, int value) {
		Node newNode = new Node(key, value); 
		int index = hash(key); 
		if(this.dataMap[index] == null) {
			this.dataMap[index] = newNode; 
		}else {
			Node temp = this.dataMap[index]; 
			while(temp.next != null) {
				temp = temp.next; 
			}
			temp.next = newNode; 
		}
		
	}
	
	public int get(String key) {
		int index = hash(key); 
		Node temp = this.dataMap[index]; 
		while(temp != null) {
			if(temp.key == key) {
				return temp.value; 
			}
			temp = temp.next; 
		}
		return 0 ;
	}
	
	public List<String> getKeys(){
		List<String> keys = new ArrayList<>(); 
		for(int i = 0; i < this.dataMap.length; i++) {
			Node temp = this.dataMap[i]; 
				while(temp != null) {
					keys.add(temp.key); 
					temp = temp.next; 
				}
		}
		return keys; 
	}
	
	public boolean validateIfVisible(int[] value1, int[] value2) {
		Map<Integer, Boolean> validate = new HashMap<>(); 
		for(int i: value1) {
			validate.put(i, true); 
		}
		for(int j: value2) {
			if(validate.get(j) != null) return true; 
		}
		return false; 
	}
}
