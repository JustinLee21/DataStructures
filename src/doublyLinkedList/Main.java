package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList myDoubly = new DoublyLinkedList(7); 
		myDoubly.getHead();
		myDoubly.printList(); 
		System.out.println(); 
		myDoubly.append(21);
		myDoubly.printList();
		myDoubly.removeLastNode(); 
		System.out.println(); 
		myDoubly.printList();
		System.out.println(); 
		myDoubly.prepend(11);
		myDoubly.prepend(200);
		myDoubly.printList();
		System.out.println(); 
		myDoubly.removeFirst(); 
		myDoubly.printList();
	

	}

}
