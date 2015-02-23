package binaryTree;

import java.util.Stack;

public class Tree {
	private Node root;
	private int size = 0;

	public Tree() {
		root = null;
	}

	public boolean nodeIsThere(int key) {
		if (find(key) != null)
			return true;
		else
			return false;
	}

	// find node in tree with desired key
	public Node find(int key) {
		Node current = root;
		// find till key does not match
		while (current.iData != key) {
			// if key is less then current data go to left child
			if (current.iData > key) {
				current = current.leftChild;
			} else {
				// else go to right child
				current = current.rightChild;
			}

			// if current equals to null then key not found
			if (current == null)
				return null;
		}
		return current;
	}

	// insert node in tree (Duplicate Accepted)
	public void insert(int iData, double dData) {
		size++;
		Node newNode = new Node(iData, dData);
		// if root is null then make newNode root
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				// if current node's data is greater then new node then go left
				if (current.iData > iData) {
					current = current.leftChild;
					if (current == null) {
						// if current does not have left child then put node on
						// current's left side
						parent.leftChild = newNode;
						return;
					}
				} else {
					// else go right
					current = current.rightChild;
					if (current == null) {
						// if current does not have right child then put node on
						// current's right side
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public boolean delete(int iData) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != iData) {
			parent = current;
			// for delete first find a node to delete
			if (current.iData > iData) {
				// if current data is greater then key then go to left branch
				// and make rightchild false
				current = current.leftChild;
				isLeftChild = true;
			} else {
				// else go to right branch and make leftchild false
				current = current.rightChild;
				isLeftChild = false;
			}
			if (current == null) {
				// no key found so return false
				return false;
			}
		}

		// if node to be deleted has no child
		// ---------------start---------------- //
		if (current.leftChild == null && current.rightChild == null) {
			// if current node is root
			if (current == root) {
				root = null;
				// if node is leftchild
			} else if (isLeftChild)
				parent.leftChild = null;
			else
				// if node is rightchild
				parent.rightChild = null;
		}
		// ---------------end-------------------//
		// if node to be deleted has one child
		// ----------------start-----------------//
		// if no left child replace it with right subtree
		else if (current.leftChild == null) {
			if (current == root)
				// if node to delete is root with right child then make right
				// child root
				root = current.rightChild;
			else if (isLeftChild)
				// parents left child
				parent.leftChild = current.rightChild;
			else
				// parents right child
				parent.rightChild = current.rightChild;
		}
		// if no right child replace it with left subtree
		else if (current.rightChild == null) {
			if (current == root)
				root = current.leftChild;
			else if (isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		}
		// ----------------end-------------------//
		// if node to be deleted has two child
		// -----------------start----------------//
		else {
			Node successor = getSuccessor(current);
			if (current == root) {
				// node to be deleted is root then there is no parent reference
				// to change
				root = successor;
			} else if (isLeftChild)
				// if node is left child of its parent then point parents left
				// child reference to successor
				parent.leftChild = successor;
			else
				// otherwise point it towards right child
				parent.rightChild = successor;

			// finally point successors left child to deletenode's leftchild
			successor.leftChild = current.leftChild;
		}
		return true;
	}

	// method gives successor for delete operation
	private Node getSuccessor(Node delNode) {
		// create successorParent and Successor
		Node successorParent = delNode;
		Node successor = delNode;
		// successor should have next highest value then delete node so first go
		// right and then all the way to left
		Node current = delNode.rightChild;
		while (current != null) {
			// traverse left by keeping reference to successor and successor's
			// paretn
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		// if successor is left side of right child of delete node two operation
		// needs to perform
		if (successor != delNode.rightChild) {
			// make successorParent's left child point toward right child of
			// successor
			successorParent.leftChild = successor.rightChild;
			// then point right child of successor to right child of delete node
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}

	public void travere(int traversType) {
		switch (traversType) {
		case 1:
			System.out.println("Inorder:");
			inOrder(root);
			break;
		case 2:
			System.out.println("Preorder:");
			preOrder(root);
			break;
		case 3:
			System.out.println("Postorder");
			postOrder(root);
			break;
		default:
			System.out
					.println(traversType
							+ " is not corrent input: Input-> 1 for inOrder, Input-> 2 for preOrder and Input-> 3 for postOrder");
			break;
		}
		System.out.println();
	}

	public void inOrder(Node localRoot) {
		// gives ascending and infix expression
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	public void preOrder(Node localRoot) {
		// gives prefix expression
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.leftChild);
			inOrder(localRoot.rightChild);
		}
	}

	public void postOrder(Node localRoot) {
		// gives postfix expression
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			inOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlank = 32;
		boolean isRowEmpty = false;
		System.out
				.println(".........................................................................");
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;

			for (int j = 0; j < nBlank; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlank * 2 - 2; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			nBlank /= 2;
			while (localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		}
	}
}
