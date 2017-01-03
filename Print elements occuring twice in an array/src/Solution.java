public class Solution{
	public static void main(String args[]){
		int[] a = {7,9,6,7,2,4,3,6,5,4};

		printTwiceOccuring(a);
	}
	private static void printTwiceOccuring(int[] a){
		for(int i=1; i<=a.length; i++){ // 1 indexing
			while(a[i-1] > i ){
				if(a[i-1] != a[a[i-1]-1])
					swap(a,i-1,a[i-1]-1);
				else{
					System.out.println(a[i-1]);
					break;
				}
			}
			if(a[i-1] < i){
				if(a[a[i-1]-1] == a[i-1]){
					System.out.println(a[i-1]);
				}
			}

		}
	}
	private static void swap(int[] a, int i, int j){ // 0 indexing
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}