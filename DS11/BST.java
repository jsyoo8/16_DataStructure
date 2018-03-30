public class BST {
	private Comparable key;
	private BST left, right;
	private BST root;

	private int leftSubtreeHeight;
	private int rightSubtreeHeight;

	public BST() {
		this.root = this;
	}

	public BST(Comparable key) {
		this.key = key;
		this.leftSubtreeHeight = 0;
		this.rightSubtreeHeight = 0;
	}

	public void insert(Object key) {
		BST p;
		if (root.key == null) {
			p = new BST((Comparable) key);
			root = p;
		} else if (root.key.compareTo(key) < 0) {
			if (root.right == null) {
				root.right = new BST();
			}
			root.right.insert(key);
		} else {
			if (root.left == null) {
				root.left = new BST();
			}
			root.left.insert(key);
		}
	}

	public Object height(BST bst) {
		int height = 0;
		int leftH = -1;
		int rightH = -1;
		if (bst.root.left != null) {
			leftH = (int) this.height(bst.root.left);
		}
		if (bst.root.right != null) {
			rightH = (int) this.height(bst.root.right);
		}
		root.leftSubtreeHeight = leftH;
		root.rightSubtreeHeight = rightH;
		if (leftH > rightH) {
			height = leftH + 1;
		} else {
			height = rightH + 1;
		}
		return height;
	}

	public void inorder(BST bst) {
		if (bst != null) {
			this.inorder(bst.root.left);
			System.out.print(bst.root.key + " ");
			this.inorder(bst.root.right);
		}
	}
}