package MyLinkedList;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l = new MyLinkedList();
//		l.print();
//		l.addNodeAtEnd(5);
//		l.addNodeAtEnd(10);
//		l.print();
//		l.addAtIndex(15, 1);
//		l.addAtIndex(20, 1);

		//System.out.println(l.size);
		l.addAtBeginning(5);
		
		l.addAtBeginning(1);

		l.deleteAtBeginning();

		l.addAtBeginning(5);
		l.print();
		l.deleteAtIndex(1);
		l.print();
		
	}

}
