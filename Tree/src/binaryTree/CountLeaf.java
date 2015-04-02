package binaryTree;

public class CountLeaf {

	/*-
	 * getLeafCount(node)
	1) If node is NULL then return 0.
	2) Else If left and right child nodes are NULL return 1.
	3) Else recursively calculate leaf count of the tree using below formula.
	Leaf count of a tree = Leaf count of left subtree + 
	                             Leaf count of right subtree
	 */
	public static int leafCountRecursive(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.rightChild == null && node.leftChild == null) {
			return 1;
		} else {
			return leafCountRecursive(node.leftChild)
					+ leafCountRecursive(node.rightChild);
		}
	}
}
