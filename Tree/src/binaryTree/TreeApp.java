package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

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
		
//		Tree tree2 = new Tree();
//		
//		tree2.insert(50, 100);
//		tree2.insert(30, 54);
//		tree2.insert(47, 200);
//		tree2.insert(100, 100);
//		tree2.insert(15, 30);
//		tree2.insert(150, 9);
//		tree2.insert(200, 40);
//		tree2.insert(5, 33);
//		tree2.insert(46, 0);
//		tree2.insert(90, 110);
		System.out.println("-----------------------------------------------");
		//System.out.println(tree.delete(100));
		//tree.displayTree();
		
		//TraversWithoutRecursion.inOder(tree);
		//TraversWithoutRecursion.preOrder(tree);
		
		//BFS_LevelOrderSearch.printGivenLevel(tree.root, 4);
		//BFS_LevelOrderSearch.levelOrder(tree.root);
		
		//System.out.println(HeightTree.heightRecursive(tree.root));
		//System.out.println(HeightTree.heightIterative(tree.root));
		
		//System.out.println(SizeOfTree.sizeRecursive(tree.root));
		//System.out.println(SizeOfTree.sizeIterative(tree.root));
		
		//System.out.println(CompareTree.sameTree(tree.root, tree2.root));
		
//		MirrorTree.mirrorRecursive(tree.root);
//		tree.displayTree();
		
//		int path[] = new int[1000];
//		int pathLen = 0;
//		Root_To_Leaf_Path.pathRecursive(tree.root, path, pathLen);
		
		//SingleLCA.lcaRecursive(150, 90, tree.root);
		
		System.out.println(CountLeaf.leafCountRecursive(tree.root));
	}
}
