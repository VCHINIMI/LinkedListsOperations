package linkedlist;

public class myNode<T> {
	private T data;
	private myNode<T> next;

	public myNode(T data) {
		this.data = data;
		next = null;
	}

	public myNode<T> getNext() {
		return next;
	}
	
	public void setNext(myNode<T> myNode) {
		this.next = myNode;
	}
	
	public T getData() {
		return data;
	}
}
