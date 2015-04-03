package binaryTree;

public class TreeDiameter {

	/*-
	 * 1) completely lie in the left sub tree or
	2) completely lie in the right sub tree or
	3) may span across the root

	Which means that the diameter can be ideally derived by
	1) the diameter of left tree or
	2) the diameter of right tree or
	3) the height of left sub tree + the height of right sub tree + 1 ( 1 to add the root node when the diameter spans across the root node)
	 */
	public static int treeDiameterRecur(Node node) {
		if (node == null)
			return 0;

		int leftHeight = HeightTree.heightRecursive(node.leftChild);
		int rightHeight = HeightTree.heightRecursive(node.rightChild);

		int leftDiameter = treeDiameterRecur(node.leftChild);
		int rightDiameter = treeDiameterRecur(node.rightChild);

		return Math.max(Math.max(rightDiameter, leftDiameter), leftHeight
				+ rightHeight + 1);
	}
	
	/*
	 * Another method to calculate with O(n) time
	 */
	
	
	private class HeightWrapper {
	    int height = 0;
	}

	private int getDiameter_helper(Node root, HeightWrapper wrapper) {
	    if (root == null) {
	        return 0; // diameter and height are 0
	    }

	    /* wrappers for heights of the left and right subtrees */
	    HeightWrapper lhWrapper = new HeightWrapper();
	    HeightWrapper rhWrapper = new HeightWrapper();

	    /* get heights of left and right subtrees and their diameters */
	    int leftDiameter = getDiameter_helper(root.leftChild, lhWrapper);
	    int rightDiameter = getDiameter_helper(root.rightChild, rhWrapper);

	    /* calculate root diameter */
	    int rootDiameter = lhWrapper.height + rhWrapper.height + 1;

	    /* calculate height of current node */
	    wrapper.height = Math.max(lhWrapper.height, rhWrapper.height) + 1;

	    /* calculate the diameter */
	    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}

	public int getDiameter(Node root) {
	    HeightWrapper wrapper = new HeightWrapper();
	    return getDiameter_helper(root, wrapper);
	}
}
