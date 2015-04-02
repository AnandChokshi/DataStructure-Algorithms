package binaryTree;

/*
 * Find Lowest Common Ancestor
 */
public class SingleLCA {

	public static void lcaRecursive(int data1, int data2, Node node) {
		if (node == null)
			return;
		else {
			if (data1 < node.iData && data2 < node.iData) {
				lcaRecursive(data1, data2, node.leftChild);
			} else if (data1 > node.iData && data2 > node.iData) {
				lcaRecursive(data1, data2, node.rightChild);
			} else {
				System.out.println(node.iData);
			}
		}
	}
}
