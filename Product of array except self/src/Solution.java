import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		
		//a[i] = a[0]*...a[i-1] * a[i+1]*....a[n-1]
		productExceptSelf(a);
	}

	private static void productExceptSelf(int[] nums) {
		// TODO Auto-generated method stub
		if(nums==null){
			System.out.println("Null array");
		}

		int[] output = new int[nums.length];
		int temp=1;

		// left side multiplication
		for(int i = 0 ; i < output.length ; i++){
			output[i] = temp;
			temp *= nums[i];
		}
		// reset temp
		temp = 1;
		// second iteration to update right hand side multiplication
		for(int i = output.length-1 ; i>=0 ; i--){
			output[i] *= temp;
			temp *= nums[i];
		}
		System.out.println(Arrays.toString(output));


	}
}
