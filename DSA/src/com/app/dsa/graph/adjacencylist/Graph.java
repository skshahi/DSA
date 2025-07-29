package com.app.dsa.graph.adjacencylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;





public class Graph {
	ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
	
	
	
	
	public Graph(ArrayList<GraphNode> nodeList) {
		//super();
		this.nodeList = nodeList;
	}
	
	public void undirectedEdge(int i,int j)
	{
		GraphNode first=nodeList.get(i);
		GraphNode second=nodeList.get(j);
		first.neighbors.add(second);
		second.neighbors.add(first);
		
	}




	//print the matrix
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<nodeList.size();i++)
		{
			sb.append(nodeList.get(i).name+": ");
		
		for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
			if(j== nodeList.get(i).neighbors.size()-1)
			{
				sb.append((nodeList.get(i).neighbors.get(j).name));
			}else {
				sb.append((nodeList.get(i).neighbors.get(j).name+"->"));
			}
						
		}
		sb.append("\n");
		}
		return sb.toString();
		
		
	}
	
	//bfs internal
	 
	void bfsVisite(GraphNode node)
	{
		LinkedList<GraphNode> queue=new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited=true;
			System.out.print(currentNode.name+" ");
			for(GraphNode neighbor:currentNode.neighbors)
			{
				if(!neighbor.isVisited)
				{
					queue.add(neighbor);
					neighbor.isVisited=true;
				}
			}
			
		}
		
		
	}
	
	//bfs method
	
	public void bfs()
	{
		for(GraphNode node:nodeList)
		{
			if(!node.isVisited)
			{
				bfsVisite(node);
			}
		}
	}
	
	//DFS (depth first search)==internally it uses stack and backtracking
	void dfsVisite(GraphNode node)
	{
		Stack<GraphNode> stack=new Stack<>();
		stack.push(node);
		while(!stack.isEmpty())
		{
			GraphNode currentNode=stack.pop();
			currentNode.isVisited=true;
			System.out.print(currentNode.name+" ");
			for(GraphNode neighbor:currentNode.neighbors)
			{
				if(!neighbor.isVisited)
				{
					stack.push(neighbor);
					neighbor.isVisited=true;
				}
			}
			
		}
		
	}
	
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
	
	 //topological sort
	  public void addDirectedEdge(int i ,int j)
	  {
		  GraphNode first=nodeList.get(i);
		  GraphNode second=nodeList.get(j);
		  first.neighbors.add(second);
		  
	  }
	  
	  //helper 
	  void topologicalVisiteEdge(GraphNode node,Stack<GraphNode> stack)
	  {
		  for(GraphNode neighbor:node.neighbors)
		  {
			  if(!neighbor.isVisited)
			  {
				  topologicalVisiteEdge(neighbor, stack);
				  
			  }
			  
		  }
		  node.isVisited=true;
		  stack.push(node);
		  
	  }
	  
	  void topologicalSort()
	  {
		  Stack<GraphNode> stack=new Stack<>();
		  for(GraphNode node: nodeList)
		  {
			  if(!node.isVisited)
			  {
				  topologicalVisiteEdge(node, stack);
			  }
		  }
		  
		  while(!stack.isEmpty())
		  {
			  System.out.print(stack.pop().name+" ");
		  }
	  }
	

}
