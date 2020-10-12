package linkedlist;

public interface INode<T> {
	INode<T> getNext();
	void setNext(INode<T> myNode);
	T getData();
}
