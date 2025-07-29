package com.app.dsa.graph.adjacencymatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
	int[][]adjacencyMatrix;
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix=new int[nodeList.size()][nodeList.size()];
		
	}
	
	public void addUndirectedEdge(int i,int j)
	{
		adjacencyMatrix[i][j]=1;
		adjacencyMatrix[j][i]=1;
		
		
	}
	
	//print the matrix
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append("   ");
		for(int i=0;i<nodeList.size();i++)
		{
			sb.append(nodeList.get(i).name+" ");
		}
		sb.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			sb.append(nodeList.get(i).name+": ");
			for(int j:adjacencyMatrix[i])
			{
				sb.append((j)+" ");
			}
			sb.append("\n");
			
		}
		
		return sb.toString();
		
	}
	
	//breath first search(BFS)
	//get neighbors
	public ArrayList<GraphNode> getNeighbors(GraphNode  node)
	{
		ArrayList<GraphNode> neighbors=new ArrayList<>();
		int nodeIndex=node.index;
		for(int i=0;i<adjacencyMatrix.length;i++)
		{
			if(adjacencyMatrix[nodeIndex][i]==1)
			{
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}
	
	//bFS internal
	 void bfsVisit(GraphNode node)
	 {
		 LinkedList<GraphNode> queue=new LinkedList<>();
		 queue.add(node);
		 while(!queue.isEmpty())
		 {
			 GraphNode currentNode = queue.remove(0);
			 currentNode.isVisited=true;
			 System.out.print(currentNode.name+" ");
			 ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			 for(GraphNode graphNode:neighbors)
			 {
				 if(!graphNode.isVisited)
				 {
					 queue.add(graphNode);
					 graphNode.isVisited=true;
				 }
				 
			 }
		 }
		 
	 }
	 
	 //BFS method
	 
	 public void bfs()
	 {
		
		 for(GraphNode node:nodeList)
		 {
			 if(!node.isVisited)
			 {
				 bfsVisit(node);
			 }
		 }
	 }
	 
	 //dfsVisite()
	 
	 void dfsVisite(GraphNode node)
	 {
		 Stack<GraphNode> stack=new Stack<>();
		 stack.push(node);
		 while(!stack.isEmpty())
		 {
			 GraphNode currentNode = stack.pop();
			 currentNode.isVisited=true;
			 System.out.print(currentNode.name+" ");
			 ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			 for(GraphNode neighbor:neighbors)
			 {
				 if(!neighbor.isVisited)
				 {
					 stack.push(neighbor);
					 neighbor.isVisited=true;
				 }
			 }
		 }
		 
	 }
	 
	 //main dfs method
	 void dfs()
	 {
		 for(GraphNode node:nodeList)
		 {
			 if(!node.isVisited)
			 {
				 dfsVisite(node);
			 }
		 }
	 }
	 
	 //direct edge
	 
	 public void addDirectedEdge(int i,int j)
	 {
		 adjacencyMatrix[i][j]=1;		 
		 
	 }
	 
	 //topologicalVisite()
	void  topologicalVisite(GraphNode node,Stack<GraphNode> stack)
	{
		ArrayList<GraphNode> neighbors = getNeighbors(node);
		for(GraphNode neighbor:neighbors)
		{
			if(!neighbor.isVisited)
			{
				topologicalVisite(neighbor, stack);
			}
			
		}
		node.isVisited=true;
		stack.push(node);
		
	}
	
	//main topological sort
	
	void topologicalSort()
	{
		Stack<GraphNode> stack=new Stack<>();
		
		for(GraphNode node:nodeList)
		{
			if(!node.isVisited)
			{
				topologicalVisite(node, stack);
			}
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop().name+" ");
		}
		
		
	}
	
	 
	 
	
	
	

	
	

}
