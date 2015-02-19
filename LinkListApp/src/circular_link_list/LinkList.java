package circular_link_list;

public class LinkList {
	private Link first;
	private Link last;

	public void insertFirst(int data) {
		Link temp = new Link(data);
		temp.next = first;
		first = temp;
		if (first.next == null) {
			last = first;
			last.next = first;
		} else {
			last.next = temp;
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void displayList() {
		Link current = first;
		if (current != null) {
			do {
				current.displayData();
				current = current.next;
			} while (current != first);
		}
	}

	public void showFirst() {
		first.displayData();
	}
}
