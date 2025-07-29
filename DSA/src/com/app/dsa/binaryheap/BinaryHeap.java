package com.app.dsa.binaryheap;

public class BinaryHeap {
	int arr[];
	int sizeOfTree;

	public BinaryHeap(int size) {
		arr = new int[size + 1];
		this.sizeOfTree = 0;
		System.out.println("The Binary heap is created successfully.");
	}
	// is empty method

	public boolean isEmpty() {
		return sizeOfTree == 0;
	}

	// peek of binary heap
	public int peek() {
		if (isEmpty()) {
			System.out.println("Binary heap is empty.");
			return 0;
		}
		return arr[1];

	}

	// size of binary heap method.

	public int sizeOfTree() {
		return sizeOfTree;
	}

	// pre order traversal
	public void preOrder(int index) {
		if (index > sizeOfTree) {
			return;
		} else {
			System.out.print(arr[index] + " ");
			preOrder(2 * index);
			preOrder(2 * index + 1);
		}
	}

	// inOrder traversal
	public void inOrder(int index) {
		if (index > sizeOfTree) {
			return;
		} else {

			preOrder(2 * index);
			System.out.print(arr[index] + " ");
			preOrder(2 * index + 1);
		}
	}

	// postOrder traversal
	public void postOrder(int index) {
		if (index > sizeOfTree) {
			return;
		} else {

			preOrder(2 * index);
			preOrder(2 * index + 1);
			System.out.print(arr[index] + " ");
		}
	}

	// levelOrder traversal
	public void levelOrder() {
		if (isEmpty()) {
			return;
		}
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// heapify for insert
	public void heapifyBottomToTop(int index, String heapType) {
		int parent = index / 2;
		if (index <= 1) {
			return;
		}
		if (heapType == "min") {
			if (arr[index] < arr[parent]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}
		} else if (heapType == "max") {
			if (arr[index] > arr[parent]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}

		}

		heapifyBottomToTop(parent, heapType);

	}

	// insert node in binary heap
	// O(logN)
	public void insert(int value, String heapType) {
		arr[sizeOfTree + 1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, heapType);
		System.out.println("The value " + value + " inserted successfully.");

	}

	// extract node from binary heap (only extract root)

	// heapifyTopToBottom

	public void heapifytopToBottom(int index, String heapType) {
		int left = index * 2;
		int right = index * 2 + 1;
		int swapChild = 0;
		// if true means we don't have any child in this tree.
		if (sizeOfTree < left) {
			return;

		}
		if (heapType == "max") {
			if (sizeOfTree == left) {
				if (arr[index] < arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;

			}else {
				if(arr[left]>arr[right])
				{
					swapChild=left;
				}else {
					swapChild=right;
				}
				if(arr[index]<arr[swapChild])
				{
					int temp=arr[index];
					arr[index]=arr[swapChild];
					arr[swapChild]=temp;
					
				}
			}
			
		}else if(heapType=="min")
		{
			if (sizeOfTree == left) {
				if (arr[index] > arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;

			}else {
				if(arr[left]<arr[right])
				{
					swapChild=left;
				}else {
					swapChild=right;
				}
				if(arr[index]>arr[swapChild])
				{
					int temp=arr[index];
					arr[index]=arr[swapChild];
					arr[swapChild]=temp;
					
				}
			}
			
		}
		heapifytopToBottom(swapChild, heapType);

	}
	
	//TC: O(logN) SC: O(logN)
	public int extractHeadOfBH(String heapType)
	{
		if(isEmpty())
		{
			return -1;
		}else {
			int extractedValue=arr[1];
			arr[1]=arr[sizeOfTree];
			sizeOfTree--;
			heapifytopToBottom(1, heapType);
			return extractedValue;
			
		}
	}
	
	//delete entire BH
	
	public void deleteBH()
	{
		arr=null;
		sizeOfTree=0;
		System.out.println("BH is deleted successfully.");
		
	}

}
