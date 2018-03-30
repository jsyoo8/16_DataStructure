public class DLinkedList {
	public Node head = new Node(null);
	private int size = 0;

	public void insert(int x) {
		Node p, q;
		if (size == 0) {
			p = new Node(x, head, head);
			head.next = p;
			head.prev = p;
			size++;
			System.out.printf("Insert%7d | ",x);
		} else {
			for (p = head.next; p != head; p = p.next) {
				if ((int) p.object >= x) {
					q = new Node(x, p.prev, p);
					p.prev.next = q;
					p.prev = q;
					size++;
					System.out.printf("Insert%7d | ",x);
					break;
				}
			}
			if (p == head) {
				q = new Node(x, p.prev, head);
				p.prev.next = q;
				head.prev = q;
				size++;
				System.out.printf("Insert%7d | ",x);
			}
		}
	}

	public void delete(int x) {
		Node p;
		if (size > 0) {
			for (p = head.next; p.next != head; p = p.next) {
				if ((int) p.object == x) {
					p.prev.next = p.next;
					p.next.prev = p.prev;
					size--;
					System.out.printf("Delete%7d | ",x);
					break;
				}
			}
		}

	}

	public void print() {
		Node p = head.next;
		for (int i = 0; i < size; i++) {
			System.out.print(p.object + "<->");
			p = p.next;
		}
		System.out.println("null");
	}
}