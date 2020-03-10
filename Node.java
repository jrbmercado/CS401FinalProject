
public class Node {
	public String id;
	public Boolean state;
	public String location;
	public Node next;
	
	public Node(String idArg, Boolean stateArg, String locationArg, Node nextArg) {
		this.id = idArg;
		this.state = stateArg;
		this.location = locationArg;
		this.next = nextArg;
	}
	
	public String getInfo() {
		String temp = "ID: " + id + " State: " + state + " Location: " + location;
		return temp;
	}
}
