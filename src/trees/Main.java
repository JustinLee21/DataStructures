package trees;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bST = new BinarySearchTree(); 
		bST.insert(47); 
		bST.insert(21); 
		bST.insert(76); 
		bST.insert(18); 
		bST.insert(27); 
		bST.insert(52); 
		bST.insert(82); 
//		System.out.println(bST.root.left.left.value); 
//		
//		System.out.println(bST.contains(7)); 
		
//		System.out.println(bST.BFS()); 
//		System.out.println(bST.DFSPreOrder()); 
//		System.out.println(bST.DFSPostOrder()); 
		System.out.println(bST.DFSInOrder()); 
		
	
		

	}

}
