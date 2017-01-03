
public class Solution {
	public static void main(String[] args) {
		int[] input = {-5,-1,-1,3,7,7,8,8,8,9};
		printMagicIndexes(input,0,input.length-1);
	}
	public static void printMagicIndexes(int a[],int i,int j){
		if(i>j || i<0 || j>(a.length-1)){
			return;
		}
		int mid = (i+j)/2; //overflow possibility for big inputs
		if (a[mid] == mid){
			System.out.println("Magic index at " + mid);
			printMagicIndexes(a,i,mid-1);
			printMagicIndexes(a,mid+1,j);
		}
		else if(a[mid] < mid){
			printMagicIndexes(a,i,a[mid]);
			printMagicIndexes(a,mid+1,j);
		}
		else{
			printMagicIndexes(a,a[mid],j);
			printMagicIndexes(a,i,mid-1);
		}
	}
}
