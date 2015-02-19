package circular_link_list;

public class LinkListCircularApp {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		
		list.displayList();
	}

}
