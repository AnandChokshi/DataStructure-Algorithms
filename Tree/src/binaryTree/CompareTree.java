package binaryTree;

public class CompareTree {

	/**
	 * recursive approach to check two trees are same or not
	 */

	/*-
	 * SameTree(tree1, tree2)
	1. If both trees are empty then return 1.
	2. Else If both trees are non -empty
	 (a) Check data of the root nodes (tree1->data ==  tree2->data)
	 (b) Check left subtrees recursively  i.e., call sameTree( 
	      tree1->left_subtree, tree2->left_subtree)
	 (c) Check right subtrees recursively  i.e., call sameTree( 
	      tree1->right_subtree, tree2->right_subtree)
	 (d) If a,b and c are true then return 1.
	3  Else return 0 (one is empty and other is not)
	 */
	public static boolean sameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		else if (root1 == null && root2 != null || root1 != null
				&& root2 == null)
			return false;
		else {
			return ((root1.iData == root2.iData)
					&& sameTree(root1.leftChild, root2.leftChild) && sameTree(
						root1.rightChild, root2.rightChild));
		}
	}
}
