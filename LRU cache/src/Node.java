
public class Node {
	public int key;
	public int value;
	Node pre;
	Node next;

	public Node(int key,int val){
		this.key = key;
		this.value = val;
		this.pre = null;
		this.next = null;
	}
}
