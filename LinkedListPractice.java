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

//Insert node in middle
	public void insert(INode<Integer> myNode, INode<Integer> prevNode) {
		if (prevNode == null)
			add(myNode);
		myNode.setNext(prevNode.getNext());
		prevNode.setNext(myNode);
	}

//Delete the element
	public INode<Integer> pop() {
		if (head == null)
			return head;
		INode<Integer> deletedNode = head;
		head.setNext(head.getNext());
		return deletedNode;
	}
}
