
public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree treeE = new BinaryTree("E");
		BinaryTree treeH = new BinaryTree("H");
		BinaryTree treeI = new BinaryTree("I");
		BinaryTree treeJ = new BinaryTree("J");
		BinaryTree treeK = new BinaryTree("K");
		BinaryTree treeD = new BinaryTree("D", null, treeH);
		BinaryTree treeB = new BinaryTree("B", treeD, treeE);
		BinaryTree treeF = new BinaryTree("F", treeI, null);
		BinaryTree treeG = new BinaryTree("G", treeJ, treeK);
		BinaryTree treeC = new BinaryTree("C", treeF, treeG);
		BinaryTree treeA = new BinaryTree("A", treeB, treeC);
		System.out.println("Tree 출력  : "+treeA.toString());
		System.out.print("Postorder : ");
		treeA.postorder(treeA);
	}
}
