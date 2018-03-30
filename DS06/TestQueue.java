
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestQueue mTestQueue = new TestQueue();

		mTestQueue.testArrayQueue();
		mTestQueue.testSlinkedQueue();
	}

	public void testArrayQueue() {
		ArrayQueue mArrayQueue = new ArrayQueue(4);
		System.out.println("******** Test Array Queue ********");
		mArrayQueue.add("DE");
		mArrayQueue.add("PA");
		mArrayQueue.add("NJ");
		mArrayQueue.remove();
		mArrayQueue.remove();
		mArrayQueue.remove();
		mArrayQueue.remove();
		mArrayQueue.add("GA");
		mArrayQueue.add("CT");
		mArrayQueue.add("MA");
		mArrayQueue.add("MD");
		mArrayQueue.add("AB");
		mArrayQueue.remove();
		System.out.println();
	}
	public void testSlinkedQueue() {
		SlinkedQueue mSlinkedQueue = new SlinkedQueue();
		System.out.println("******** Test Slinked Queue ********");
		mSlinkedQueue.add("DE");
		mSlinkedQueue.add("PA");
		mSlinkedQueue.add("NJ");
		mSlinkedQueue.remove();
		mSlinkedQueue.remove();
		mSlinkedQueue.remove();
		mSlinkedQueue.remove();
		mSlinkedQueue.add("GA");
		mSlinkedQueue.add("CT");
		mSlinkedQueue.add("MA");
		mSlinkedQueue.add("MD");
		mSlinkedQueue.add("AB");
		mSlinkedQueue.remove();
		System.out.println();
	}
}
