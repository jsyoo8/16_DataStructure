
public class SlinkedQueue implements Queue {
	Node front;
	int num = 0;

	private class Node {
		Node next;
		Object data;

		Node(Object object, Node node) {
			this.data = object;
			this.next = node;
		}
	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		if (this.size()==0) {
			front = new Node(object, front);
			num++;
		} else {
			Node rear = front;
			while (rear.next != null) {
				rear = rear.next;
			}
			rear.next = new Node(object, rear.next);
			num++;
		}
		System.out.print("ADD      " + object);
		this.print();
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			return null;
		} else {
			return front.data;
		}
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			System.out.println("Queue is Empty");
			return null;
		}
		Object first = this.first();
		front = front.next;
		num--;
		System.out.print("REMOVE   " + first);
		this.print();
		return first;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(" | ");
		for (Node rear = front; rear != null; rear = rear.next) {
			System.out.print(rear.data);
			System.out.print("<--");
		}
		System.out.print("null");
		System.out.println();
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub

	}

}
