package binaryTree;

public class MirrorTree {

	/**
	 * Recursive method to create a mirror tree
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
