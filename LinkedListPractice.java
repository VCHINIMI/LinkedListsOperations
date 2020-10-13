package linkedlist;

public class LinkedListPractice {
	private INode<Integer> head = null;
	private INode<Integer> tail;

	public LinkedListPractice() {
		tail = head;
	}

	public INode<Integer> getHead() {
		return head;
	}

	public INode<Integer> getTail() {
		return tail;
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

//Deleting last node
	public INode<Integer> popLast() {
		INode<Integer> deletedNode = tail;
		INode<Integer> temp = head;
		while (temp.getNext() != tail) {
			temp = temp.getNext();
		}
		tail = temp;
		return deletedNode;
	}

//Searching node with value
	public boolean searchByValue(int val) {
		if (head == null)
			return false;
		INode<Integer> temp = head;
		while (temp != null) {
			if (temp.getData() == val)
				return true;
			temp = temp.getNext();
		}
		return false;
	}

//Delete by value and output size in end
	public int showSizeByDeleting(int val) {
		int size = 0;
		INode<Integer> temp = head;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		size = deleteNodeByVal(size, val);
		return size;
	}

//Delete by value
	public int deleteNodeByVal(int size, int val) {
		INode<Integer> temp = head;
		while (temp != null) {
			if (temp.getNext().getData() == val) {
				temp = temp.getNext().getNext();
				return size - 1;
			}
			temp = temp.getNext();
		}
		return size;
	}

//Sorting while adding
	public INode<Integer> sortedAdd(INode<Integer> myNode) {
		if (head == null) {
			head = myNode;
			tail = head;
			return head;
		}
		myNode.setNext(head);
		if (head.getData() < myNode.getData()) {
			int temp = head.getData();
			head.setData(myNode.getData());
			myNode.setData(temp);
		}
		head = myNode;
		return head;
	}

//Linked List as Stack- PUSH Operation
	public INode<Integer> push(INode<Integer> myNode) {
		add(myNode);
		return head;
	}

//PEEK operation
	public int peek(INode<Integer> top) {
		return top.getData();
	}

//POP operation on stack
	public INode<Integer> popStack() {
		head = head.getNext();
		return head;
	}

//ENQUEUE operation in queue
	public void enqueue(INode<Integer> myNode) {
		append(myNode);
	}

//DEQUEUE Operation in queue
	public INode<Integer> dequeue() {
		INode temp = head;
		head = head.getNext();
		return temp;
	}
}
