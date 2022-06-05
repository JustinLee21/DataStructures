package stackAndQueue;

// LIFO (Last In - First Out Process)
public class Stack {
	private Node top; 
	private int length; 
	
	public Stack(int value) {
		Node newNode = new Node(value); 
		this.top = newNode; 
		this.length =1; 
	}
	//Inner class
	class Node{
		int value;
		Node next; 
		Node(int value){
			this.value = value; 
		}
	}
	
	public void getHeight() {
		System.out.print("Height: " + this.length+"\n"); 
	}
	
	public void getTop() {
		System.out.print("Top: "+top.value+"\n"); 
	}
	
	public void printStack() {
		Node temp = this.top; 
		int counter = 0; 
		while(temp != null) { 
			System.out.print("Value At " + counter + ": "+ temp.value + "\n");
			temp = temp.next; 
			counter++; 
			
			
		}
	}
	
	public void push(int value) {
		Node newNode = new Node(value); 
		if(this.length == 0) {
			newNode = this.top; 
		}else {
		newNode.next = this.top; 
		this.top = newNode; 
		}
		this.length++; 
	}
	
	public Node pop() {
		Node temp = this.top;
		if(this.length == 0) {
			return null; 
		}
		if (this.length == 1) {
			this.top = null; 
		}else {
			this.top = this.top.next; 
			temp.next = null; 
		}
		this.length--; 
		return temp; 
	}

}
