package binaryTree;

public class TreeApp {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.displayTree();

		tree.insert(50, 100);
		tree.insert(30, 54);
		tree.insert(47, 200);
		tree.insert(100, 100);
		tree.insert(15, 30);
		tree.insert(150, 9);
		tree.insert(200, 40);
		tree.insert(5, 33);
		tree.insert(46, 0);
		tree.insert(90, 110);
		
		tree.displayTree();
		System.out.println(tree.delete(100));
		tree.displayTree();
	}
}
