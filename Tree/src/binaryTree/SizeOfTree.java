package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {

	/**
	 * Recursive method to find the size of tree Size of tree is defined by
	 * total number of nodes
	 * 
	 * @param root
	 * @return
	 */
	public static int sizeRecursive(Node root) {
		if (root == null)
			return 0;
		else
			return sizeRecursive(root.leftChild)
					+ sizeRecursive(root.rightChild) + 1;
	}

	public static int sizeIterative(Node root) {
		
		if(root == null)
			return 0;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		int size = 0, nodeCount;

		Node temp;

		while (true) {
			nodeCount = queue.size();
			size += nodeCount;

			// nodeCount is 0 then return size
			if (nodeCount == 0)
				return size;

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
