
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		if(binarySearchIterative(a,5)) System.out.println("Number found");
		else System.out.println("Not found");
		
		int i = 0, j = a.length - 1;
		if(binarySearchRecursive(a,i,j,4)) System.out.println("Number found");
		else System.out.println("Not found");
	}

	private static boolean binarySearchRecursive(int[] a,int i, int j, int x) {
		// TODO Auto-generated method stub
		if(i>j){
			return false;
		}
		int mid = i + (j - i) / 2 ;
		if(a[mid] == x) {
			return true;
		}
		else if (a[mid] < x){
			return binarySearchRecursive(a, mid +1 , j, x);
		}
		else{
			return binarySearchRecursive(a, i, mid - 1, x);
		}

	}

	private static boolean binarySearchIterative(int[] a,int x) {
		// TODO Auto-generated method stub
		int i = 0, j=a.length - 1;
		while(i <= j){
			int mid = i + (j - i) / 2 ;
			if(a[mid] == x) return true;
			else if (a[mid] < x) i = mid +1;
			else j = mid - 1;
		}
		
		return false;
	}

}
