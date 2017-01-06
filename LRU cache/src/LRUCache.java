import java.util.*;

public class LRUCache {
    
    private int capacity;
    private HashMap<Integer,Node> hm = new HashMap<>();
    DoublyLinkedList dll = new DoublyLinkedList();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
        	Node n = hm.get(key);

        	dll.remove(n);
        	dll.addAtEnd(n);
        	hm.put(key, n);
        	
        	return hm.get(key).value;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(dll.size < capacity){
        	if(hm.containsKey(key)){
        		Node n = hm.get(key);
        		hm.remove(key);
        		
        		
        		dll.remove(n);
        		
        		n = new Node(key,value);
        		hm.put(key, n);
        		dll.addAtEnd(n);
        		
        	}
        	else{
        		Node n = new Node(key,value);
        		hm.put(key,n);
        		dll.addAtEnd(n);
        	}
        }
        else{
        	if(hm.containsKey(key)){
        		Node n = hm.get(key);
        		hm.remove(key);
        		
        		
        		dll.remove(n);
        		
        		n = new Node(key,value);
        		hm.put(key, n);
        		dll.addAtEnd(n);
        		
        	}
        	else{
	        	int removed_key = dll.remove(dll.head);
	        	hm.remove(removed_key);
	
	        	Node n = new Node(key,value);
	    		hm.put(key,n);
	    		dll.addAtEnd(n);
        	}

        }
    }
}