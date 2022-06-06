package trees;

public class BinarySearchTree {
	private int length; 
	int value; 
	Node root; 
	public BinarySearchTree(int value) {
		Node newNode = new Node(value); 
		this.root = newNode; 
	}
	
	public BinarySearchTree() {
		this.root = null; 
	}
	
	class Node{
		Node left; 
		Node right; 
		int value; 
		Node(int value){
			this.value = value; 
		}
	}
	
	public void printTree() {
		Node temp = this.root; 
		while(temp != null) {
			System.out.println(temp.value); 
			temp = temp.left; 
		}
	}
	
	public boolean insert(int value) {
		Node newNode = new Node(value); 
		if(this.root == null) {
			this.root = newNode; 
			return true; 
		}
		Node temp = this.root; 
		while(true) {
			if(temp.value == newNode.value) {
				return false; 
			}else if(temp.value > newNode.value) {
				if(temp.left == null) {
					temp.left = newNode; 
					return true; 
				}
				temp = temp.left; 
			}else{
				if(temp.right == null) {
					temp.right = newNode; 
					return true; 
				}
				temp = temp.right; 
			}
		}
	}
	
	public boolean contains(int value) {
			Node temp = this.root; 
			while(temp != null) {
				if(temp.value > value) {
					temp = temp.left; 
				}else if(temp.value < value){
					temp = temp.right; 
				}else {
					//returns true if value is equal to current node.
					return true; 
				}
			}
		//return false if current node is null. 
		return false; 
	}
}
