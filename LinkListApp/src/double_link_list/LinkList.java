package double_link_list;

public class LinkList {
	public Link first;
	public Link last;

	public LinkList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Link temp = new Link(data);
		// Check for Empty list
		if (isEmpty()) {
			last = temp;
		} else {
			// if not empty provide link between new and previous first node
			first.previous = temp;
		}
		// point new node to previous first node
		temp.next = first;
		// point first to new node
		first = temp;
	}

	public void insertLast(int data) {
		Link temp = new Link(data);
		// point last to new node
		if (isEmpty()) {
			// if empty point first to new node as well
			first = temp;
		} else {
			// otherwise point new last node to previous last node
			temp.previous = last;
			// then point previous last node's next to new last node
			last.next = temp;
		}
		// point last to new node
		last = temp;
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			// point first to next of previous first node
			first = first.next;
			// if only one node remains
			if (first == null) {
				last = null;
			} else {
				// make previous null of newly appointed first node
				first.previous = null;
			}
			System.out.println("Node Deleted");
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			// make second last node last
			last = last.previous;
			// if only one node is there then make first null
			if (first.next == null) {
				first = null;
			} else {
				// otherwise make null of last node
				last.next = null;
			}
			System.out.println("Node Deleted");
		}
	}

	public void insertBefore(int key, int data) {
		Link newLink = new Link(data);
		if (isEmpty()) {
			// if list is empty then add node first
			insertFirst(data);
		} else {
			Link temp = first;
			while (temp.data < key) {
				temp = temp.next;
				// check whether temp reaches at the end
				if (temp == null) {
					// if temp is at the end add node to End
					insertLast(data);
					return;
				}
			}
			if (temp.previous == null) {
				// if temp is first node then add first node
				insertFirst(data);
				return;
			}
			// follow this steps if node needs to be added in between two nodes
			// temp is currently pointing at the node after the desired position
			temp.previous.next = newLink;
			newLink.next = temp;
			temp.previous = newLink;
		}
	}

	public void deleteData(int data) {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			Link temp = first;
			while (temp.data != data) {
				temp = temp.next;
				// check that data exist or not
				if (temp == null) {
					System.out.println("Data not found");
					return;
				}
			}
			if (temp == first) {
				// if its first node then execute method deleteFirst
				deleteFirst();
				System.out.println("Node Deleted");
				return;
			} else if (temp == last) {
				// if its last node then execute method deleteLast
				deleteLast();
				System.out.println("Node Deleted");
				return;
			} else {
				// otherwise follow this steps to delete node in between
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
			}
		}
	}

	public void displayForward() {
		Link temp = first;
		while (temp != null) {
			temp.displayLink();
			temp = temp.next;
		}
	}

	public void displayBackward() {
		Link temp = last;
		while (temp != null) {
			temp.displayLink();
			temp = temp.previous;
		}
	}
}
