
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,-5,5,-12,6,6};
		if ( sum(a,0) == 0){
			System.out.println("Sum is 0");
		}else{
			System.out.println("Sum is not zero");
		}
	}

	private static int sum(int[] a, int i) {
		if(i == a.length){
			return 0;
		}
		int z = i + 1;
		int sum = sum(a,z);
		if(a[i] + sum == 0){
			return 0;
		}
		else if(a[i] - sum == 0){
			return 0;
		}
		else{
			return a[i] + sum;
		}
		
	}

}
