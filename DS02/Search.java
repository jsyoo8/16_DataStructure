public class Search {

	private int sequentialSearchCount;
	private int binarySearchCount;

	public Search() {
		this.sequentialSearchCount = 0;
		this.binarySearchCount = 0;
	}

	public int getSequentialSearchCount() {
		return this.sequentialSearchCount;
	}

	public int getBinarySearchCount() {
		return this.binarySearchCount;
	}

	public int sequentialSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			sequentialSearchCount++;
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(int arr[], int x) {
		int p = 0, q = arr.length - 1;
		int i;
		while (p <= q) {
			i = (p + q) / 2;
			binarySearchCount++;
			if (arr[i] == x) {
				return i;
			} else if (x > arr[i]) {
				p = i + 1;
			} else {
				q = i - 1;
			}
		}
		return -1;
	}

	public void sQprintMassage(int p, long t1) {
		if (p >= 0) {
			System.out.println("***** ���� Ž�� *****");
			System.out.println("ã�� ��ġ(index) : " + (p + 1) + " / �� Ƚ�� : " + this.getSequentialSearchCount()
					+ " / ��� �ð� : " + t1 / 1000000.0 + "ms");
		} else {
			System.out.println("ã���ô� ���ڴ� �����ϴ�");
		}
	}

	public void bNprintMassage(int q, long t2) {
		if (q >= 0) {
			System.out.println("***** ���� Ž�� *****");
			System.out.println("ã�� ��ġ(index) : " + (q + 1) + " / �� Ƚ�� : " + this.getBinarySearchCount() + " / ��� �ð� : "
					+ t2 / 1000000.0 + "ms");
		} else {
			System.out.println("ã���ô� ���ڴ� �����ϴ�");
		}
	}
}