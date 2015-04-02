package binaryTree;

public class BFS_LevelOrder_Spiral {

	public static void spiralRecur_givenLevel(Node node, int level, boolean mode) {

		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.iData + " ");
		else {
			if (mode) {
				spiralRecur_givenLevel(node.leftChild, level - 1, mode);
				spiralRecur_givenLevel(node.rightChild, level - 1, mode);
			} else {
				spiralRecur_givenLevel(node.rightChild, level - 1, mode);
				spiralRecur_givenLevel(node.leftChild, level - 1, mode);
			}
		}
	}

	public static void levelOrder_Spiral(Node root) {
		int height = HeightTree.heightRecursive(root);
		boolean mode = false;
		for (int i = 1; i <= height; i++) {
			spiralRecur_givenLevel(root, i, mode);
			mode = mode ? false : true;
			System.out.println();
		}
	}
}
