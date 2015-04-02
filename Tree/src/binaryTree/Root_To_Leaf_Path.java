package binaryTree;

/*
 * Algorithm to print root to leaf path one per line
 */
public class Root_To_Leaf_Path {

	/*- Algo:
	 * 
	 * initialize: pathlen = 0, path[1000]
	1000 is some max limit for paths, it can change

	printPathsRecur(tree, path[], pathlen)
	1) If node is not NULL then 
	     a) push data to path array: 
	            path[pathlen] = node->data.
	     b) increment pathlen 
	            pathlen++
	2) If node is a leaf node then print the path array.
	3) Else
	    a) Call printPathsRecur for left subtree
	             printPathsRecur(node->left, path, pathLen)
	    b) Call printPathsRecur for right subtree.
	            printPathsRecur(node->right, path, pathLen
	 * 
	 */
	public static void pathRecursive(Node node, int path[], int pathLen) {
		if (node == null) {
			return;
		} else {
			path[pathLen] = node.iData;
			pathLen++;

			if (node.rightChild == null && node.leftChild == null) {
				for (int i = 0; i < pathLen; i++) {
					System.out.print(path[i] + " ");
				}
				System.out.println();
			} else {
				pathRecursive(node.leftChild, path, pathLen);
				pathRecursive(node.rightChild, path, pathLen);
			}
		}
	}
}
