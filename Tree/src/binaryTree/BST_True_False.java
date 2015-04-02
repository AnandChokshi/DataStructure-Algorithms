package binaryTree;

public class BST_True_False {

	public static boolean isBSTRecursive(Node node, int min, int max) {
		if (node == null)
			return true;
		else {
			if (node.iData < min || node.iData > max)
				return false;
			else {
				return isBSTRecursive(node.leftChild, min, node.iData)
						&& isBSTRecursive(node.rightChild, node.iData, max);
			}
		}

	}
}
