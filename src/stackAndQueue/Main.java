package stackAndQueue;

public class Main {

	public static void main(String[] args) {
		Stack stack1 = new Stack(21); 

		stack1.push(11);
		stack1.push(2);
		stack1.push(4);
		stack1.pop(); 
		
		stack1.getHeight(); 
		stack1.getTop(); 
		stack1.printStack();
		
		Queue queue1 = new Queue(21); 
		
		queue1.enqueue(1);
		queue1.enqueue(4);
		queue1.dequeue();
		
		queue1.getLength(); 
		queue1.getFirst();
		queue1.printQueue(); 
		
		
		
		
		
		
		
	}

}
