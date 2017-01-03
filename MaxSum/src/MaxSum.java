//http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
// 3 2 7 10     - 13 (3+10)
// 3 2 5 10  7   - (15)  (3+5+7) 

public class MaxSum{
	public static void main(String args[]){
		int a[] = {3,2,7,10};
//		int a[] = {3,2,5,10,7};

		int maxSum = getMax(a,0,a.length-1);
		
		
		System.out.println(maxSum);
	}
	
	public static int getMax(int a[],int i,int j){
		if(i+1<=j)
			return Math.max(a[i] + getMax(a,i+2,j), a[i+1] + getMax(a,i+3,j));
		if(i==j)
			return a[i];
		return 0;

	}
}
