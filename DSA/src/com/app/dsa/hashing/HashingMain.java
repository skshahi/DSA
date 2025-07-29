package com.app.dsa.hashing;

public class HashingMain {

	public static void main(String[] args) {
		DirectChaining dc=new DirectChaining(13);
		dc.insertHashTable("The");
		dc.insertHashTable("quick");
		dc.insertHashTable("down");
		dc.insertHashTable("fox");
		dc.insertHashTable("over");
		dc.displayHashTable();
		dc.searchHashTable("foxx");
		dc.deleteKeyHashTable("fox");
		dc.searchHashTable("fox");
		

	}

}
