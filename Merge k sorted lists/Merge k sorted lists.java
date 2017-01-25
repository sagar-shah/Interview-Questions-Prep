/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public static Comparator<ListNode> customComparator = new Comparator<ListNode>(){
		public int compare(ListNode l1,ListNode l2){
			return l1.val - l2.val;
		}
	};

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>(1, customComparator);

        for(int i= 0 ; i<lists.length ; i++){
        	if(lists[i]!= null){
        		pq.add(lists[i]);
        	}
        }

        ListNode head = new ListNode(5);
        ListNode ptr = head;

        while(true){
        	ListNode temp = pq.poll();
        	if(temp == null){
        		break;
        	}
        	ptr.next = temp;
            ptr = ptr.next;
        	ListNode nextNode = temp.next;
        	temp.next = null;

        	if(nextNode != null)
        		pq.add(nextNode);

        }

        ListNode newHead = head.next;
        head = null;

        return newHead;


    }
}