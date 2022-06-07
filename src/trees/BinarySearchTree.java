package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
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
	
	//Breadth First Search
	public ArrayList<Integer> BFS(){
		Node currentNode = this.root; 
		Queue<Node> queue = new LinkedList<>(); 
		ArrayList<Integer> results = new ArrayList<>(); 
		queue.add(currentNode); 
		
		while(queue.size()> 0) {
			currentNode = queue.remove(); 
			results.add(currentNode.value); 
			if(currentNode.left != null) {
				queue.add(currentNode.left); 
			}
			if(currentNode.right != null) {
				queue.add(currentNode.right); 
			}
		}
		return results; 
	}
	//Depth First Search (PreOrder)
	public ArrayList<Integer>DFSPreOrder(){
		ArrayList<Integer> results = new ArrayList<>(); 
		class Traverse{
			Traverse(Node currentNode){
				results.add(currentNode.value); 
				if(currentNode.left != null) {
					new Traverse(currentNode.left); 
				}
				if(currentNode.right != null) {
					new Traverse(currentNode.right); 
				}
			}
		}
		new Traverse(this.root); 
		return results; 
	}
	
	//Depth First Search (PostOrder)
	public ArrayList<Integer> DFSPostOrder(){
		Node currentNode = this.root; 
		ArrayList<Integer> results = new ArrayList<>(); 
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left != null) {
					new Traverse(currentNode.left); 
				}
				if(currentNode.right != null) {
					new Traverse(currentNode.right); 
				}
				results.add(currentNode.value); 
			}
		}
		new Traverse(currentNode); 
		return results; 
	}
	
	//Depth First Search (InOrder)
	public ArrayList<Integer> DFSInOrder(){
		Node currentNode = this.root; 
		ArrayList<Integer> results = new ArrayList<>(); 
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left != null) {
					new Traverse(currentNode.left); 
				}
				results.add(currentNode.value); 
				if(currentNode.right != null) {
					new Traverse(currentNode.right); 
				}
			}
		}
		new Traverse(currentNode); 
		return results; 
		
	}
}
