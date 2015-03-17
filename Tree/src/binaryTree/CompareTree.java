package binaryTree;

public class CompareTree {

	/**
	 * recursive approach to check two trees are same or not
	 */
	public static boolean sameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		else if (root1 == null && root2 != null || root1 != null
				&& root2 == null)
			return false;
		else {
			return ((root1.iData == root2.iData) 
					&& sameTree(root1.leftChild, root2.leftChild)
					&& sameTree(root1.rightChild, root2.rightChild));
		}
	}
}
