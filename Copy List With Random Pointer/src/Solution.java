
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
        	return null;
        }

        RandomListNode ptr = head;

        //generate new nodes and link them
        while(ptr!=null){
        	RandomListNode new_node = new RandomListNode(ptr.label);
        	new_node.next = ptr.next;
        	ptr.next = new_node;

        	ptr = ptr.next.next;
        }
        //link random nodes
        ptr = head;
        while(ptr!=null){
        	if(ptr.random == null){
        		ptr.next.random = null;
        	}
        	else{
        		ptr.next.random = ptr.random.next;
        	}
        	ptr = ptr.next.next;
        }
        //remove original links
        RandomListNode new_head = head.next;

        ptr = head;
        while(ptr!=null){
        	RandomListNode temp = ptr.next;
        	if(temp!=null ){
	        	ptr.next = temp.next;
	        	if(temp.next!=null){
	        		temp.next = temp.next.next;
	        	}
	        }
        	ptr = ptr.next;

        }

        return new_head;
    }

}
