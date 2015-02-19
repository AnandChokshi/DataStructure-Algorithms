package double_link_list;

public class DoubleLinkList {

	public static void main(String[] args) {
		LinkList list = new LinkList();

		list.insertFirst(20);
		list.insertFirst(10);
		list.insertLast(30);
		list.insertBefore(40, 50);
		list.insertBefore(10, 5);
		list.displayForward();
		list.displayBackward();
		list.deleteFirst();
		list.deleteLast();
		list.deleteData(20);
		list.deleteData(30);
		list.deleteData(10);
		list.deleteData(50);
		System.out.println();
	}

}
