import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = generateLinkedList();
		
		

		checkIfPalindrome(head);

		printList(head);
	}
	private static void checkIfPalindrome(Node head){
		
		//keep elements till middle on stack
		Node current = head,runner = head;
		Stack<Node> s = new Stack<Node>();

		while(runner!=null){
			s.push(current);
			current = current.next;
			if(runner.next!=null){
				runner = runner.next.next;
			}
			else{
				s.pop();
				break;
			}
		}
		

		while(current!=null){
			if(current.data == s.pop().data){
				current = current.next;
			}
			else{
				System.out.println("Not palindrome");
				break;
			}
		}
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		if(head == null){
			System.out.println("List empty");
			return;
		}
		
		Node ptr = head;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

	private static Node generateLinkedList() {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(1);

		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		
		return n1;
	}

}
