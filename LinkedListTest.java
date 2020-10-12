package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	@Test
	public void add3NodesSingleLinkedListTest1() {
		myNode<Integer> myFirstNode = new myNode<>(56);
		myNode<Integer> mySecondNode = new myNode<>(30);
		myNode<Integer> myThirdNode = new myNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}
}
