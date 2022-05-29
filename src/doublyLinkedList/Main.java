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
		System.out.println(); 
		System.out.println(myDoubly.getNode(0).value); 
		myDoubly.getLength(); 
		myDoubly.append(4); 
		myDoubly.append(4); 
		myDoubly.append(4); 
		System.out.println(myDoubly.set(1, 21)); 
		myDoubly.getLength(); 
		myDoubly.printList(); 
		myDoubly.insert(3, 9); 
		System.out.println(); 
		myDoubly.printList(); 
		System.out.println(); 
		myDoubly.printList();
		System.out.println();
		System.out.println(myDoubly.remove(4).value);  
		myDoubly.printList(); 
	

	}

}
