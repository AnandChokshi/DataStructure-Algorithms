package towerOfHanoi;

public class TowerHanoi {
	static int disk = 3;

	public static void main(String[] args) {
		tower(3, 'A', 'B', 'C');
	}

	public static void tower(int disk, char from, char inter, char to) {
		if (disk == 1) {
			// move the disk here
			System.out.println("Move Disk 1 from " + from + " To " + to);
		} else {
			// move subtree which is n-1 disk to intermediate node
			tower(disk - 1, from, to, inter);
			System.out.println("Move Disk" + disk +" from "+ from + " To " + to);
			// move nth disk to Destination node
			tower(disk -1, inter, from , to);
		}
	}
}
