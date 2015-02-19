package simple_link_list_withFindandDelete;

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
		System.out.println("-----------Find Data------------------");

		Link f = theList.find(3);
		if (f == null) {
			System.out.println("Key not found");
		} else {
			System.out.println("Found Key = " + f.iData);
		}

		System.out.println("-----------Delete Data----------------");
		if (!theList.isEmpty()) {
			Link d = theList.delete(3);
			if (d == null) {
				System.out.println("Key not found");
			} else {
				System.out.println("Deleted key = " + d.iData);
			}
		}

		
		System.out.println("---------------------------");
		theList.displayList();
	}

}
