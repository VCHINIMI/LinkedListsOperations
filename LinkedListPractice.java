package linkedlist;

public class LinkedListPractice {
	private INode<Integer> head = null;
	private INode<Integer> tail;

	public LinkedListPractice() {
		tail = head;
	}

//Add node 
	public void add(INode<Integer> myNode) {
		if (tail == null)
			tail = myNode;
		if (head == null)
			head = myNode;
		else {
			myNode.setNext(head);
			head = myNode;
		}
	}

//Appending node at end
	public void append(INode<Integer> myNode) {
		if (tail != null) {
			tail.setNext(myNode);
			tail = myNode;
		} else if (tail == null) {
			tail = myNode;
			head = myNode;
		}
	}
}
