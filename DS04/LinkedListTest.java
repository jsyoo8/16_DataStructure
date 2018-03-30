import java.util.Random;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList mLinkedList = new LinkedList();
		LinkedList nLinkedList = new LinkedList();
		Random mRandom = new Random();
		while (mLinkedList.index < 10) {
			mLinkedList.insert(mRandom.nextInt(100));
		}
		while (nLinkedList.index < 10) {
			nLinkedList.insert(mRandom.nextInt(100));
		}
		System.out.println("***** Insert LinkedList *****");
		mLinkedList.print();
		mLinkedList.reverse();
		System.out.println("***** Reverse LinkedList *****");
		mLinkedList.print();
		System.out.println("***** Insert LinkedList *****");
		nLinkedList.print();
		mLinkedList.merge(nLinkedList);
		System.out.println("***** Merge LinkedList *****");
		mLinkedList.print();
	}
}
