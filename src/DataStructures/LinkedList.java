package DataStructures;

public class LinkedList {
	private Node head; 
	private Node tail;  
	private int length; 
	
		public LinkedList() {
			this.length =1; 
		
		}
		public LinkedList(int value) {
			Node newNode = new Node(value); 
			this.head = newNode; 
			this.tail = newNode;  
			this.length =1; 
			
		}
	
	public class Node{
		int value; 
		Node next; 
		
		Node(int value){
			this.value = value; 
		}
		
	}
	
	public static void main(String ...args) {
		LinkedList myLinkedList = new LinkedList(4); 
		myLinkedList.appendToTail(21);
		myLinkedList.appendToTail(1);
		myLinkedList.appendToTail(51);
		myLinkedList.prepend(701);
		myLinkedList.printList(); 
		myLinkedList.printHead();
		myLinkedList.printTail();
		myLinkedList.printLength();
		
		
		
	}
	
	public void printList() {
		Node temp = head; 
		while (temp != null) {
			System.out.print(temp.value + "->"); 
			temp = temp.next; 
		}
	}
	
	public void printHead() {
		System.out.println("\n" + "Head: "+ head.value); 
	}
	
	public void printTail() {
		System.out.println("Tail: " + tail.value); 
	}
	
	public void printLength() {
		System.out.println("Length: " + length); 
	}
	
	public void appendToTail(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			this.head = newNode; 
			this.tail = newNode; 
		}else {
			this.tail.next = newNode; 
			this.tail = newNode; 
			this.length++; 
		
		}
	}
	
	public void removeLastItem() {
		if(this.head == null) {
			System.out.println("There are no nodes to remove"); 
		}else if(this.length ==1){
			this.head = null; 
			this.tail = null; 
			length--; 
		}else {
			Node currentNode = this.head; 
			while(currentNode.next != this.tail) {
				currentNode = currentNode.next; 
			}
			this.tail = currentNode; 
			currentNode.next = null; 
			length--; 
		}
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value); 
		if(this.head == null) {
			this.head = newNode; 
			this.tail = newNode; 
		}else {
			newNode.next = this.head; 
			this.head = newNode; 
		}
		length++; 
	}
	
	public Node removeFirst() {
		Node firstNode = null; 
		if(this.head == null) {
			System.out.println("Cannot remove as there are no nodes in this object"); 
		}else if(this.length == 1) {
			this.head = null; 
			this.tail = null; 
			this.length--; 
		}else {
			firstNode = this.head;
			this.head = this.head.next; 
			firstNode.next = null; 
			this.length--; 
		}
		return firstNode; 
	}
	
	public int get(int index) {
		if(index > this.length || index <= 0) {
			System.out.println("This request is out of bounds"); 
			return 0; 
		}else {
			int counter = 1; 
			Node identify = this.head; 
			while(counter != index) {
				identify = identify.next; 
				counter++; 
			}
			return identify.value; 
		}
	}
	

}
