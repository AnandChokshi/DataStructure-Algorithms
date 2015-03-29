package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightTree {

	/**
	 * Recursive approach to find height of binary tree
	 * 
	 * @param root
	 * @return
	 */

	/*-
	 * maxDepth()
	1. If tree is empty then return 0
	2. Else
	 (a) Get the max depth of left subtree recursively  i.e., 
	      call maxDepth( tree->left-subtree)
	 (a) Get the max depth of right subtree recursively  i.e., 
	      call maxDepth( tree->right-subtree)
	 (c) Get the max of max depths of left and right 
	      subtrees and add 1 to it for the current node.
	     max_depth = max(max dept of left subtree,  
	                         max depth of right subtree) 
	                         + 1
	 (d) Return max_depth
	 */
	public static int heightRecursive(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + Math.max(heightRecursive(root.leftChild),
					heightRecursive(root.rightChild));
	}

	/**
	 * Height of tree Iterative method using queue
	 */
	public static int heightIterative(Node root) {

		if (root == null)
			return 0;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		int height = 0, nodeCount;

		Node temp;

		while (true) {
			nodeCount = queue.size();

			// nodeCount is 0 then return height otherwise increment it
			if (nodeCount == 0)
				return height;

			height++;

			// Remove all previous level child and add their child to queue
			while (nodeCount > 0) {
				temp = queue.poll();
				if (temp.rightChild != null)
					queue.add(temp.rightChild);
				if (temp.leftChild != null)
					queue.add(temp.leftChild);
				nodeCount--;
			}
		}
	}
}
