package circular_link_list;

public class Link {
	public int data;
	public Link next;

	public Link(int data) {
		this.data = data; 
	}

	void displayData() {
		System.out.println("Data: " + data);
	}
}
