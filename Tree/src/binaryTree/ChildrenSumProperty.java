package binaryTree;

public class ChildrenSumProperty {

	public static boolean childrenSumRecur(Node node) {
		if (node == null || node.leftChild == null && node.rightChild == null)
			return true;
		else {
			int left = node.leftChild == null ? 0 : node.leftChild.iData;
			int right = node.rightChild == null ? 0 : node.rightChild.iData;

			if (node.iData == (left + right)
					&& childrenSumRecur(node.leftChild)
					&& childrenSumRecur(node.rightChild)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
