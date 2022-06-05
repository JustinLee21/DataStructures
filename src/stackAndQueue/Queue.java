package stackAndQueue;

import stackAndQueue.Stack.Node;

//FIFO (First-In, First-Out Process); 
public class Queue {
	private int length; 
	private Node first; 
	private Node last; 
	public Queue(int value) {
		Node newNode = new Node(value); 
		this.first = newNode; 
		this.last = newNode; 
		this.length = 1; 
	}
	
	//inner class
	class Node{
		int value; 
		Node next; 
		Node(int value){
			this.value = value; 
		}
	}
	
	public void getLength() {
		System.out.print("Length: " + this.length+"\n"); 
	}
	
	public void getFirst() {
		System.out.print("Top: "+first.value+"\n"); 
	}
	
	public void printQueue() {
		Node temp = this.first;  
		int counter = 0; 
		while(temp != null) { 
			System.out.print("Value At " + counter + ": "+ temp.value + "\n");
			temp = temp.next; 
			counter++; 
		}
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value); 
		if(this.length == 0) {
			this.first = newNode; 
			this.last = newNode; 
		}else {
			this.last.next = newNode; 
			this.last = newNode; 
		}
		this.length++; 
	}
	
	public Node dequeue() {
		Node temp = this.first; 
		if(this.length == 0) {
			return null; 
		}
		if(this.length ==1) {
			this.first = null; 
			this.last = null; 
		}else {
			this.first = this.first.next; 
			temp.next = null; 
		}
		this.length--; 
		return temp; 
	}

}
