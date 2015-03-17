package binaryTree;

public class BFS_LevelOrderSearch {
	/**
	 * Function to print all the node at given level
	 */
	public static void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.println(root.iData);
		else {
			printGivenLevel(root.leftChild, level - 1);
			printGivenLevel(root.rightChild, level - 1);
		}
	}

	/**
	 * Function for BFS or level order traversal
	 */
	public static void levelOrder(Node root) {
		int height = HeightTree.heightRecursive(root);
		for (int i = 1; i <= height; i++) {
			printGivenLevel(root, i);
		}
	}
}
