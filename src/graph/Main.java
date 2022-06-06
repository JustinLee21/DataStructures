package graph;

public class Main {

	public static void main(String[] args) {
		Graph graph1 = new Graph(); 
		
		graph1.addVertex("A"); 
		graph1.addVertex("B"); 
		graph1.addVertex("C"); 
		
	
		//Linked both vertexes with an edge so A<--->B
		System.out.println(graph1.addEdge("A", "B")); 
		System.out.println(graph1.addEdge("A", "C")); 
		System.out.println(graph1.addEdge("B", "C")); 
		
//		graph1.removeEdge("A", "B"); 
		
		graph1.removeVertex("C"); 
		
		
		graph1.printGraph(); 

	}

}
