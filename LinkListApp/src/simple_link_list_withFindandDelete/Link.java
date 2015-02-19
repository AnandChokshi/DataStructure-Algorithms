package simple_link_list_withFindandDelete;

public class Link {
	public int iData;
	public double dData;
	public Link next;

	public Link(int id, double data) {
		iData = id;
		dData = data;
	}

	public void displayLink() {
		System.out.println("{ " + iData + ", " + dData + " }");
	}
}
