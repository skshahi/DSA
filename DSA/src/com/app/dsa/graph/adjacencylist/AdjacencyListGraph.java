package com.app.dsa.graph.adjacencylist;

import java.util.ArrayList;

public class AdjacencyListGraph {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList=new ArrayList<>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		Graph graph=new Graph(nodeList);
		graph.undirectedEdge(0, 1);
		graph.undirectedEdge(0, 2);
		graph.undirectedEdge(0, 3);
		graph.undirectedEdge(1, 4);
		graph.undirectedEdge(2, 3);
		graph.undirectedEdge(3, 4);
		
		
		System.out.println(graph.toString());
		//graph.bfs();
		graph.dfs();
		
		//------------------------------------------------
		ArrayList<GraphNode> nodeList2=new ArrayList<>();
		nodeList2.add(new GraphNode("A", 0));
		nodeList2.add(new GraphNode("B", 1));
		nodeList2.add(new GraphNode("C", 2));
		nodeList2.add(new GraphNode("D", 3));
		nodeList2.add(new GraphNode("E", 4));
		nodeList2.add(new GraphNode("F", 5));
		nodeList2.add(new GraphNode("G", 6));
		nodeList2.add(new GraphNode("H", 7));
		
		Graph graph2=new Graph(nodeList2);
		graph2.addDirectedEdge(0, 2);
		graph2.addDirectedEdge(2, 4);
		graph2.addDirectedEdge(4, 7);
		graph2.addDirectedEdge(4, 5);
		graph2.addDirectedEdge(5, 6);
		graph2.addDirectedEdge(1, 2);
		graph2.addDirectedEdge(1, 3);		
		graph2.addDirectedEdge(3, 5);
		System.out.println("\n");
		
		System.out.println(graph2.toString());
		graph2.topologicalSort();
		
		
		
		
		

	}

}
