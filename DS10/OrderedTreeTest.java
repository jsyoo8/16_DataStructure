import java.util.*;

public class OrderedTreeTest {
	public static void main(String[] args) {
		OrderedTree treeA, treeB, treeC, treeD, treeF, treeG;
		OrderedTree treeE = new OrderedTree("E");
		OrderedTree treeH = new OrderedTree("H");
		OrderedTree treeI = new OrderedTree("I");
		OrderedTree treeJ = new OrderedTree("J");
		OrderedTree treeK = new OrderedTree("K");

		LinkedList subtreesOfD = new LinkedList();
		subtreesOfD.add(0, treeH);
		treeD = new OrderedTree("D", subtreesOfD);

		LinkedList subtreesOfB = new LinkedList();
		subtreesOfB.add(0, treeD);
		subtreesOfB.add(1, treeE);
		treeB = new OrderedTree("B", subtreesOfB);

		LinkedList subtreesOfF = new LinkedList();
		subtreesOfF.add(0, treeI);
		treeF = new OrderedTree("F", subtreesOfF);

		LinkedList subtreesOfG = new LinkedList();
		subtreesOfG.add(0, treeJ);
		subtreesOfG.add(1, treeK);
		treeG = new OrderedTree("G", subtreesOfG);

		LinkedList subtreesOfC = new LinkedList();
		subtreesOfC.add(0, treeF);
		subtreesOfC.add(1, treeG);
		treeC = new OrderedTree("C", subtreesOfC);

		LinkedList subtreesOfA = new LinkedList();
		subtreesOfA.add(0, treeB);
		subtreesOfA.add(1, treeC);
		treeA = new OrderedTree("A", subtreesOfA);
		
		System.out.print("Postorder : ");
		treeA.postorder();
	}
}
