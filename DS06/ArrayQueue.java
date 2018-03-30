
public class ArrayQueue implements Queue {
	int rear = 0;
	int front = -1;
	Object[] q;

	public ArrayQueue(int t) {
		q = new Object[t];
	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		if (front < 0) {
			q[rear++] = object;
			front++;
		} else if (rear == q.length) {
			System.out.println("Queue is Full! RESIZE");
			this.resize();
			q[rear++] = object;
		} else {
			q[rear++] = object;
		}
		System.out.print("ADD      " + object);
		this.print();
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			return null;
		}
		return q[front];
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			System.out.println("Queue is Empty");
			return null;
		}
		Object first = this.first();
		front++;
		System.out.print("REMOVE   " + first);
		this.print();
		return first;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int i = rear - front;
		return i;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(" | ");
		for (int i = 0; i < this.size(); i++) {
			System.out.print(q[front + i]);
			if (i + 1 >= this.size()) {
				break;
			}
			System.out.print("<--");
		}
		System.out.println();
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		Object[] nq = q;
		int ql = q.length;
		q = new Object[2 * ql];
		System.arraycopy(nq, 0, q, 0, ql);
	}

}