
public class MyLinkedList {
	Node head = null;
	int size;

	MyLinkedList() {
		size = 0;
	}

	public void addNodeAtEnd(int data) {
		Node n = new Node(data);
		if (head != null) {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = n;
		} else {
			head = n;
		}
		size += 1;
	}

	public void addAtBeginning(int data) {
		Node n = new Node(data);
		if (head != null) {
			Node temp = head;
			head = n;
			head.next = temp;
		} else {
			head = n;
		}
		size += 1;
	}

	public void addAtIndex(int data, int index) {
		if (index == 0) {
			this.addAtBeginning(data);
		} else {
			Node n = new Node(data);
			if (index < size) {
				if (head != null) {
					Node ptr = head;
					while (index - 1 > 0) {
						ptr = ptr.next;
						index--;
					}
					Node temp = ptr.next;
					ptr.next = n;
					n.next = temp;
				} else {
					head = n;
				}
				size += 1;
			} else {
				System.out.println("Index greater than size of list");
			}
			
		}
	}

	public void deleteAtBeginning() {
		if (head != null) {
			head = head.next;
			size -= 1;
		} else {
			System.out.println("List is empty");
		}
	}
	public void deleteAtIndex(int index){
		if(index<size){
			if(index == 0){
				this.deleteAtBeginning();
			}
			else{
				Node ptr = head;
				while(index>1){
					ptr = ptr.next;
					index--;
				}
				ptr.next = ptr.next.next;
				size -= 1;
			}
		}else{
			System.out.println("Index greater than size of list");
		}
	}
	public void print() {
		if (head != null) {
			Node ptr = head;
			while (ptr != null) {
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
		} else {
			System.out.println("List empty");
		}
	}

}
