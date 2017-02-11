
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = {-2,1,-3,4,-1,2,1,-5,4};
		int max = getMaxSum(a);
		System.out.println(max);
	}

	private static int getMaxSum(int[] a) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int num : a){
			if(sum < 0){
				sum = num;
			}
			else{
				sum += num;
			}
			if(sum > max){
				max = sum;
			}
		}
		return max;
	}

}
