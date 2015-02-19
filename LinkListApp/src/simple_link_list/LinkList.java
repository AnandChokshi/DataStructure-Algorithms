package simple_link_list;

public class LinkList {
	private Link first;

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double data) {
		Link newtLink = new Link(id, data);
		newtLink.next = first;
		first = newtLink;
	}

	public void deleteFirst() {
		first = first.next;
	}

	public void displayList() {
		Link current;
		current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}
}
