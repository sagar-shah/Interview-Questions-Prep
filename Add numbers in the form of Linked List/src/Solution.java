
public class Solution {

	static MyLinkedList result = new MyLinkedList();
	static int carry = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l1 = new MyLinkedList();
		l1.addNodeAtEnd(9);
		l1.addNodeAtEnd(9);
		l1.addNodeAtEnd(9);
//		l1.addNodeAtEnd(4);
		MyLinkedList l2 = new MyLinkedList();
		l2.addNodeAtEnd(9);;
		l2.addNodeAtEnd(9);
		l2.addNodeAtEnd(9);
		
		if( l1.size > l2.size){
			l2 = addpadding(l2,l1.size - l2.size);
		}
		else{
			l1 = addpadding(l1, l2.size - l1.size);
		}
		
		add(l1.head,l2.head);
		if(carry == 1) result.addAtBeginning(1);
		result.print();
		
	}

	private static void add(Node n1, Node n2) {
		if(n1 == null && n2 == null){
			return ;
		}
		add(n1.next, n2.next);
		int digit = (n1.data + n2.data + carry)%10;
		carry = (n1.data + n2.data + carry)/10;
		result.addAtBeginning(digit);
		
		return;
		
	}

	private static MyLinkedList addpadding(MyLinkedList l,int padding) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i < padding ; i++){
			l.addAtBeginning(0);
		}
		return l;
	}

}
