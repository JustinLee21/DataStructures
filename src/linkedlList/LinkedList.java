package linkedlList;

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
//		myLinkedList.appendToTail(1);
//		myLinkedList.appendToTail(51);
		myLinkedList.prepend(701);
		myLinkedList.printList(); 
		myLinkedList.printHead();
		myLinkedList.printTail();
		myLinkedList.printLength();
		
//		System.out.println(myLinkedList.removeFirst().value); 
//		System.out.println(myLinkedList.removeFirst().value);
//		System.out.println(myLinkedList.removeFirst().value);
		System.out.println(myLinkedList.get(1).value);  
		System.out.println(myLinkedList.get(2).value);  
		System.out.println(myLinkedList.get(myLinkedList.length-1).next);   
		myLinkedList.printList(); 
		System.out.println(); 
//		myLinkedList.insert(-1, 25); 
		myLinkedList.insert(2, 22); 
		myLinkedList.printList();
		myLinkedList.set(1, 255); 
		System.out.println(); 
		myLinkedList.printList(); 
//		myLinkedList.remove(myLinkedList.length-1); 
		System.out.println(); 
		myLinkedList.appendToTail(44);
		myLinkedList.printList(); 
		System.out.println(); 
		myLinkedList.reverse();
		myLinkedList.printList(); 
		
		
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
			return null; 
		}else if(this.length == 1) {
			firstNode = this.head; 
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
	
	public Node get(int index) {
		if(index > this.length || index < 0) {
			System.out.println("This request is out of bounds"); 
			return null; 
		}else {
			int counter = 0; 
			Node identify = this.head; 
			while(counter != index) {
				identify = identify.next; 
				counter++; 
			}
			return identify; 
		}
	}
	
	public boolean insert (int index, int value) {
		if(index < 0 || index > this.length) throw new NullPointerException("This is not a reasonable value! Cannot < 0 || > .length");  
		Node node = new Node(value); 
		if(index == 0) {
			node.next = this.head; 
			this.head = node; 
		}
		Node forward = this.head; 
		Node behind = this.get(index-1); 
		int counter = 0; 
		while (counter != index) {
			forward = forward.next; 
			++counter; 
		}
		behind.next = node; 
		node.next = forward; 
		return true; 
		
	}
	
	public boolean set(int index, int value) {
		if(index < 0 || index > this.length) throw new NullPointerException("Out of bounds!!"); 
		Node pointer = this.head; 
		int counter = 0; 
		while(index != counter) {
			pointer = pointer.next; 
			counter++; 
		}
		pointer.value = value; 
		return true; 
		
	}
	
	public Node remove(int index) {
		if(index < 0 || index > this.length) throw new NullPointerException("Out of bounds!"); 
		Node pointer = this.head; 
		if(index == 0) {
			this.head = pointer.next; 
			return pointer; 
		}
		int counter = 0; 
		while(index != counter) {
			pointer = pointer.next; 
			++counter; 
		}
		Node priorNode = this.get(index-1); 
		priorNode.next = pointer.next; 
		pointer.next = null; 
		return pointer;
	}
	
	public void reverse() {
		if(this.head == this.tail) System.out.println("There is only one node in linked list"); 
		Node temp = this.head; 
		this.head = this.tail; 
		this.tail = temp; 
		Node before = null; 
		Node after = temp.next; 
		for(int i = 0; i <= this.length; i++) {
			after = temp.next; 
			temp.next = before; 
			before = temp; 
			temp = after; 
		}
		
	}
	
	
	
	

}
