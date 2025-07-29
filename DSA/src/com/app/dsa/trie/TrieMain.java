package com.app.dsa.trie;

public class TrieMain {

	public static void main(String[] args) {
		Trie trie=new Trie();
		trie.insert("API");
		trie.insert("APIS");
		trie.search("APIS");
		trie.delete("APIS");
		trie.search("APIS");
		//System.out.println(trie.root.children);

	}

}
