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
		
		if(root == null)
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
				if(temp.leftChild != null)
					queue.add(temp.leftChild);
				nodeCount--;
			}
		}
	}
}
