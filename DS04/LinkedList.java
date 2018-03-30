public class LinkedList implements LinkedListMethod {

	Node start;
	int index = 0;

	private class Node {
		int data;
		Node next;

		Node(int nData, Node nextNode) {
			this.data = nData;
			this.next = nextNode;
		}
	}

	public boolean find(int x) {
		if (start != null) {
			if (start.data == x) {
				return true;
			} else {
				Node p = start;
				while (p.next != null) {
					if (p.next.data == x) {
						return true;
					}
					p = p.next;
				}
			}
		}
		return false;
	}

	@Override
	public void insert(int x) {
		// TODO Auto-generated method stub
		if (this.find(x) == false) {
			start = new Node(x, start);
			this.index++;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Node p = start;
		while (p != null) {
			System.out.print(p.data + " > ");
			p = p.next;
		}
		System.out.print("null\n");
	}

	@Override
	public void delete(int x) {
		// TODO Auto-generated method stub
		if (start.data == x) {
			start = start.next;
			this.index--;
		} else {
			Node p = start;
			while (p.next != null) {
				if (p.next.data == x) {
					p.next = p.next.next;
					this.index--;
					break;
				}
				p = p.next;
			}
		}
	}

	@Override
	public void merge(LinkedList arg0) {
		// TODO Auto-generated method stub
		Node p = start;
		while (p.next != null) {
			p = p.next;
		}
		p.next = arg0.start;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		Node p = start;
		int x;
		while (p != null) {
			x = p.data;
			p = p.next;
			delete(x);
			insert(x);
		}

	}

}