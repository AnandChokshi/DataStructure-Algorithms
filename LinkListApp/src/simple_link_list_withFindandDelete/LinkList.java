package simple_link_list_withFindandDelete;

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

	public Link find(int key) {
		Link current = first;

		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}

	public Link delete(int key) {
		Link deleteLink = first;
		Link previous = first;

		while (deleteLink.iData != key) {
			if (deleteLink.next == null) {
				return null;
			} else {
				previous = deleteLink;
				deleteLink = deleteLink.next;
			}
		}
		if (deleteLink == first) {
			first = first.next;
		} else {
			previous.next = deleteLink.next;
		}

		return deleteLink;
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
