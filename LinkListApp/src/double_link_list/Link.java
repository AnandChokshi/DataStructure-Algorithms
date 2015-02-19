package double_link_list;

public class Link {
	public int data;
	public Link next;
	public Link previous;

	public Link(int data) {
		this.data = data;
	}

	public void displayLink() {
		System.out.println("Data: " + data);
	}
}
