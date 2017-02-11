import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = {-1, 0, 1, 2, -1, -4};
//		int[] a = {0,0,0};
		
		List<List<Integer>> result = getUniqueTriplets(a);
		System.out.println(result);
		
	}

	private static List<List<Integer>> getUniqueTriplets(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
		for(int i = 0 ; i < nums.length - 2 ; ){
//			System.out.println(i);
			int left = i + 1,right = nums.length - 1;
			while(left<right){
				if(nums[i] + nums[left] + nums[right] == 0){
					List<Integer> l = new LinkedList<>();
					l.add(nums[i]);
					l.add(nums[left]);
					l.add(nums[right]);
					res.add(l);
					do{
					left++;
					} while(left < nums.length && nums[left] == nums[left-1]);
					do{
					right--;
					}while(right > -1 && nums[right] == nums[right+1]);
				}
				else if( nums[i] + nums[left] + nums[right] < 0 ){
					left++;
				}
				else{
					right--;
				}
			}
			do{
				i++;
			} while( i < nums.length && nums[i] == nums[i-1]);
		}
		
		return res;
	}

}
