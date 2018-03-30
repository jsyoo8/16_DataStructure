public class Queue {
	Node front;
	int num = 0;
	int price, amount;

	private class Node {
		Node next;
		int price;
		int amount;

		Node(int price, int amount, Node next) {
			this.price = price;
			this.amount = amount;
			this.next = next;
		}
	}

	public void add(int price, int amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
			if (this.size() == 0) {
				front = new Node(price, amount, front);
				num++;
			} else {
				Node rear = front;
				while (rear.next != null) {
					rear = rear.next;
				}
				rear.next = new Node(price, amount, rear.next);
				num++;
			}
		}else{
			System.out.println("취소합니다.");//0개 구매 or 판매시
		}
	}

	public Node first() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			return null;
		} else {
			return front;
		}
	}

	public Node remove() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			System.out.println("Queue is Empty");
			return null;
		}
		Node first = this.first();
		front = front.next;
		num--;
		return first;
	}

	public int size() {
		// TODO Auto-generated method stub
		return num;
	}

	public void print() {
		// TODO Auto-generated method stub
		if (this.size() != 0) {
			System.out.print(" | [" + front.price + "원:" + front.amount + "개]");
			Node rear = front.next;
			while (rear != null) {
				System.out.print("<--");
				System.out.print("[" + rear.price + "원:" + rear.amount + "개]");
				rear = rear.next;
			}
		}
		System.out.println();
	}

	public int fPrice() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			return 0;
		} else {
			return front.price;
		}
	}

	public int fAmount() {
		// TODO Auto-generated method stub
		if (this.size() == 0) {
			return 0;
		} else {
			return front.amount;
		}
	}

	public void reAmount(int num) {
		if (this.size() != 0) {
			front.amount = num;
			if (num == 0) {
				this.remove();
			}
		}
	}
}
