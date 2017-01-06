
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 2;
		LRUCache lru = new LRUCache(capacity);
		
		lru.set(2, 1);
		lru.set(2, 2);
		System.out.println(lru.get(2));
		lru.set(1, 1);
		lru.set(4, 1);
		System.out.println(lru.get(2));
		
		
	}

}
