import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,0,0,1,1,1};
		rearrange(input);
		System.out.println(Arrays.toString(input));
	}

	private static void rearrange(int[] input) {
		// TODO Auto-generated method stub
		int ptr = 0;
		int l0 = 0;
		int r1 = input.length - 1;
		
		while(l0<=r1){
			if(input[ptr] == 0){
//				swap(ptr,l0,input);
				l0++;
//				if(ptr<l0){
					ptr++;
//				}
				continue;
			}
			if(input[ptr] == 1){
				swap(ptr,r1,input);
				r1--;
			}
		}
	}

	private static void swap(int a, int b, int[] input) {
		// TODO Auto-generated method stub
		int temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
	

}
