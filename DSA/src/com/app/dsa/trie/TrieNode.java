package com.app.dsa.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character,TrieNode> children; 
	boolean endOfString;
	
	public TrieNode()
	{
		children=new HashMap<>();
		endOfString=false;
		
	}

	@Override
	public String toString() {
		return "TrieNode [children=" + children + ", endOfString=" + endOfString + "]";
	}
	
	
	
	

}
