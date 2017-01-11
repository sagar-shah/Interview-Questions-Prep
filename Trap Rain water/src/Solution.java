
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};

		int waterCollected = getWaterCollected(a);

		System.out.println(waterCollected);
	}
	private static int getWaterCollected(int[] arr){
		int leftMax = 0;
		int rightMax = 0;
		int a = 0;
		int b = arr.length-1;
		int waterCollected = 0;

		while(a<=b){
			leftMax = Math.max(leftMax,arr[a]);
			rightMax = Math.max(rightMax,arr[b]);

			if(leftMax < rightMax){
				waterCollected += leftMax - arr[a];
				a++;
			}
			else{
				waterCollected += rightMax - arr[b];
				b--;

			}
		}
		return waterCollected;
	}

}
