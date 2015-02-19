package simple_link_list;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insertFirst(1, 10);
		theList.insertFirst(2, 20);
		theList.insertFirst(3, 30);
		theList.insertFirst(4, 40);
		theList.insertFirst(5, 50);
		theList.insertFirst(6, 60);
		
		theList.displayList();
		System.out.println("---------------------------");
		if(!theList.isEmpty()){
			theList.deleteFirst();
		}
		
		theList.displayList();
	}

}
