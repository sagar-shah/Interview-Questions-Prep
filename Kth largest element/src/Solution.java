import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int[] nums = {3,2,1,5,6,4,10};
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);
        
        for(int i = 0 ; i < k ; i++){
            minHeap.add(nums[i]);
//            minHeap.
        }
        System.out.println(minHeap);
        for(int i = k ; i < nums.length ; i++){
        	if(nums[i] > minHeap.peek()){
        		minHeap.remove();
        		minHeap.add(nums[i]);
        	}
        }
        System.out.println(minHeap);
        
        System.out.println(minHeap.peek());
	}
        

}
