package doublyLinkedList;

public class DoublyLinkedList {
	private Node head; 
	private Node tail; 
	private int length; 
	
	public DoublyLinkedList(int value) {
		Node node = new Node(value);  
		this.head = node; 
		this.tail = node; 
		this.length = 1; 
	}
	//inner class
	class Node{
		int value; 
		Node next; 
		Node previous; 
		
		Node(int value){
			this.value = value; 
		}
	}
	
	public void printList() {
		Node temp = this.head; 
		while(temp != null) {
			System.out.print("<-"+temp.value + "->"); 
			temp = temp.next; 
		}
	}
	
	public void getHead() {
		System.out.println("Head: "+ this.head.value); 
	}
	
	public void getTail() {
		System.out.println("Tail: "+ this.tail.value); 
	}
	
	public void getLength() {
		System.out.println("Length of Doubly Linked List: "+ this.length); 
	}
	
	public void append(int value) {
		Node newNode = new Node(value); 
		if(this.head == null) {
			this.head = newNode; 
			this.tail = newNode; 
		}else {
			this.tail.next = newNode; 
			newNode.previous = this.tail; 
			this.tail = newNode; 
		}
		length++; 
	}
	
	public Node removeLastNode() {
		if(this.head == null) throw new NullPointerException("Cannot return empty DLL"); 
			Node temp = this.tail; 
			this.tail = this.tail.previous; 
			this.tail.next = null; 
			temp.previous = null; 
			this.length--; 
			//As a result of above 5 above lines trigger the length to zero. 
			if(this.length == 0) {
				this.head = null; 
				this.tail = null; 
			}
			return temp; 
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value); 
		if(this.head == null) {
			this.head = newNode; 
			this.tail = newNode; 
		}else {
			this.head.previous = newNode; 
			newNode.next = this.head; 
			this.head = newNode; 
		}
		this.length++; 
	}
	
	public Node removeFirst() {
		if(this.length == 0) throw new NullPointerException("No available nodes to remove"); 
		Node pointer = this.head; 
		if(this.length == 1) {
			this.head = null; 
			this.tail = null;  
		}else {
			this.head = this.head.next; 
			this.head.previous = null; 
			pointer.next = null; 
		}
		this.length--; 
		return pointer; 
	}
	
	public Node getNode(int index) {
		if(this.length < 0 || index > this.length) throw new NullPointerException("Cannot find an index of a blank object"); 
		Node pointer; 
		int counter; 
		if(this.length == 1) {
			return this.head; 
		}
		pointer = this.head; 
		if(index < (this.length/2)) {
			counter = 0; 
			while(counter != index) {
				pointer = pointer.next; 
				counter++; 
			}
		}else {
			counter = this.length-1; 
			pointer = this.tail; 
				while(index != counter) {
					pointer = pointer.previous; 
					counter--; 
				}
		}
		
		return pointer; 
	}
	
	public boolean set(int index, int value) {
		if(this.length < 0 || index >= this.length) throw new NullPointerException("FALSE, cannot access a node that is not existent in the current object"); 
		Node pointer; 
		if(this.length ==1) {
			this.head.value = value; 
			this.tail.value = value; 
			return true;  
		}else{
			if(index < this.length/2) {
				pointer = this.head; 
				for(int i = 0; i != index; i++) {
					pointer = pointer.next; 
				}
			}else {
				pointer = this.tail; 
				for(int i = this.length -1; i != index; i--) {
					pointer = pointer.previous; 
				}
			}
		}
		pointer.value = value; 
		return true; 
	}
	//Set method that incorporates other helper methods. 
	public boolean updatedSet(int index, int value) {
		Node temp = getNode(index); 
		if(temp != null) {
			temp.value = value; 
			return true; 
		}else {
			return false; 
		}
		
	}
	
	public boolean insert(int index, int value) {
		Node temp = getNode(index);
		Node newNode = new Node(value); 
		if(index == 0) {
			prepend(value); 
			return true; 
		}
		if(index == this.length) {
			append(value); 
			return true; 
		}
		if(temp != null) {
			Node before = getNode(index-1); 
			Node after = before.next; 
			before.next = newNode; 
			after.previous = newNode; 
			newNode.previous = before; 
			newNode.next = after; 
			return true; 
		}else {
			return false; 
		}
	}
	
	public Node remove(int index) {
		if(this.length < 0 || index >= this.length) throw new NullPointerException("Cannot remove a value that is not available in the object"); 
		Node current = this.head; 
		if(index == 0) {
			current = removeFirst(); 
		}
		if(this.length -1 == index) {
			current = removeLastNode(); 

		}
		if(index >0 && index < this.length -1) {
			current = getNode(index); 
			current.previous.next = current.next; 
			current.next.previous = current.previous; 
			current.previous = null; 
			current.next = null; 
		}
		this.length --; 
		return current; 
	}
	
	
}
