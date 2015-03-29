package binaryTree;

public class MirrorTree {

	/**
	 * Recursive method to create a mirror tree
	 */

	/*-
	 * Algorithm - Mirror(tree):

	(1)  Call Mirror for left-subtree    i.e., Mirror(left-subtree)
	(2)  Call Mirror for right-subtree  i.e., Mirror(left-subtree)
	(3)  Swap left and right subtrees.
	      temp = left-subtree
	      left-subtree = right-subtree
	      right-subtree = temp
	 */
	public static void mirrorRecursive(Node root) {
		if (root == null)
			return;
		else {
			mirrorRecursive(root.leftChild);
			mirrorRecursive(root.rightChild);

			Node temp;
			temp = root.leftChild;
			root.leftChild = root.rightChild;
			root.rightChild = temp;
		}
	}
}
