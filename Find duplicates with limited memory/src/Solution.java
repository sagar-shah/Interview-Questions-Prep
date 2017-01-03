//array can consist of numbers from 1 to N.
//N can be at most 32000.
//you only have 4kb of memory

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1245,4,27845,8,7,9,15000,1245,894,32,2,5,4,27845};

		printDuplicates(arr);
	}
	public static void printDuplicates(int[] arr){
		BitVector b = new BitVector();
		for(int i=0; i<arr.length; i++){
			if(b.isSet(arr[i])){
				System.out.println(arr[i]);
			}
			else{
				b.setBit(arr[i]);
			}
		}
	}
}
