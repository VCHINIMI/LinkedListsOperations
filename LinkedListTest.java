package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

//Testing if three nodes are getting added
	@Test
	public void add3NodesSingleLinkedListTest1() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}

	@Test
	public void checkAdding3NodesToLinkedListTest2() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		LinkedListPractice llp = new LinkedListPractice();
		llp.add(myFirstNode);
		llp.add(mySecondNode);
		llp.add(myThirdNode);
		boolean test = myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode);
		assertTrue(test);
	}

	@Test
	public void checkAppending3NodesToLinkedListTest2() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		LinkedListPractice llp = new LinkedListPractice();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}
}
