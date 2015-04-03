package binaryTree;

public class BinaryBalance {

	public static boolean isBalancedRecur(Node node) {
		/* Base case - Empty tree is always balanced */
		if (node == null)
			return true;

		/* Compute height of the left and right subtree and their difference */
		int heightDifference = HeightTree.heightRecursive(node.leftChild)
				- HeightTree.heightRecursive(node.rightChild);

		if (Math.abs(heightDifference) <= 1) {
			return isBalancedRecur(node.leftChild)
					&& isBalancedRecur(node.rightChild);
		} else
			return false;
	}
}
