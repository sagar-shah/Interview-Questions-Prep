
public class DoublyLinkedList {
	public Node head = null;
	public Node tail = null;
	public int size = 0;

	public void addAtEnd(Node n){
		size++;
		if(head == null && tail == null){
			head = n;
			tail = n;
		}
		else{
			tail.next = n;
			n.pre = tail;
			tail = tail.next;
		}
	}

	public int remove(Node n){
		if(n!=null)
			size--;

		int key = n.key;

		if(head == tail && head == n){
			head = null;
			tail = null;
			return key;
		}
		if(head == n){
			head = head.next;
			n.next = null;
			head.pre = null; 
			return key;
		}
		if(tail == n){
			tail = tail.pre;
			n.pre = null;
			tail.next = null;
			return key;
		}


		n.pre.next = n.next;
		n.next.pre = n.pre;

		return key;
	}
}
