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
			System.out.println("<-"+temp.value + "->"); 
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
	
	
	

}
