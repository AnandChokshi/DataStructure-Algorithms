package simple_link_list;

public class Link {
	private int iData;
	private double dData;
	public Link next;

	public Link(int id, double data) {
		iData = id;
		dData = data;
	}

	public void displayLink() {
		System.out.println("{ " + iData + ", " + dData + " }");
	}
}
