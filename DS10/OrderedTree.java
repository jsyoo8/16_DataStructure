import java.util.*;

public class OrderedTree {
	private Object root;
	private List<Object> subtrees;
	private int size;

	public OrderedTree() {
	}

	public OrderedTree(Object root) {
		this.root = root;
		subtrees = new LinkedList<Object>();
		size = 1;
	}

	// 내부 코드 작성
	public OrderedTree(Object root, List<Object> trees) {
		this.root = root;
		OrderedTree tree;
		size = 1;
		if (trees.size() > 0) {
			subtrees = trees;
			for (int i = 0; i < trees.size(); i++) {
				tree = (OrderedTree) trees.get(i);
				size += tree.size();
			}
		}
	}

	// 내부 코드 작성
	public void postorder() {
		OrderedTree tree;
		for (int i = 0; i < this.subtrees.size(); i++) {
			tree = (OrderedTree) this.subtrees.get(i);
			tree.postorder();
		}
		System.out.print(this.root+" ");
	}

	public int size() {
		return size;
	}
}
