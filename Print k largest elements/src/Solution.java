import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter k");
		Scanner s = new Scanner(System.in);
		final int k = s.nextInt();
		int[] numbers = {-5,2,33,4,5,66,7,8,9,10};
		
		BinaryHeap bh = new BinaryHeap(5);
		for(int i = 0 ; i < numbers.length ; i++){
			if(i<k){
				bh.addElement(numbers[i]);		
			}
			else{
				if(bh.getMin() < numbers[i]){
					bh.extractMin();
					bh.addElement(numbers[i]);
				}
			}
		}
		
		for(int i = 0; i<k ; i++){
			System.out.println(bh.extractMin());
		}
		
		
		
	}

}
