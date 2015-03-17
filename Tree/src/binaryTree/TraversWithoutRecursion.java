package binaryTree;

import java.util.Stack;

public class TraversWithoutRecursion {
	public static void inOder(Tree tree) {
		Node node = tree.root;
		if (node == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Stack<Node> treeStack = new Stack<Node>();
		System.out.println();
		while (!treeStack.isEmpty() || node != null) {
			if (node != null) {
				treeStack.push(node);
				node = node.leftChild;

			} else {
				node = treeStack.pop();
				System.out.print(node.iData + " ");
				node = node.rightChild;
			}
		}
	}

	public static void preOrder(Tree tree) {
		if (tree.root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Stack<Node> treeStack = new Stack<Node>();
		System.out.println();
		treeStack.push(tree.root);
		while (!treeStack.isEmpty()) {
			Node node = treeStack.pop();
			System.out.print(node.iData + " ");
			if (node.rightChild != null) {
				treeStack.push(node.rightChild);
			}
			if (node.leftChild != null) {
				treeStack.push(node.leftChild);
			}
		}
	}
}
