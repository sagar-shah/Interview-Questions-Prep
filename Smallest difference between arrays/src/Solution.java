import java.util.*;
public class Solution {
	public static void main(String[] args) {
		int[] a = {3,12,10,47,20};
		int[] b = {223,48,42,99};

		int smallestDiff = getSmallestDiff(a,b);
		System.out.println(smallestDiff);
	}
	public static int getSmallestDiff(int[] a,int[] b){
		if(a == null || b == null)
			return -1;

		Arrays.sort(a);
		Arrays.sort(b);

		int smallestDiff = Integer.MAX_VALUE;
		int i=0,j=0;
		while(i<a.length && j<b.length){
			if(a[i] - b[j] < smallestDiff && a[i] - b[j] >= 0){
				smallestDiff = a[i] - b[j];
			}
			
			if(a[i] > b[j]){
				j++;
			}
			else{
				i++;
			}
		}

		return smallestDiff;
	}
}
