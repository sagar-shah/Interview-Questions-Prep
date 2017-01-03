
public class Solution {
	public static void main(String[] args) {
		int[] a = {2,9,13,19,0,0,0};
		int[] b = {7,6,15};
		a = sortedMerge(a,b);
		for(int z : a){
			System.out.println(z);
		}
	}
	public static int[] sortedMerge(int[] a,int[] b){

		for(int i = (a.length - b.length)-1,j = b.length-1, destination = a.length-1; j>=0 ; destination--){
			if(i>=0){
			if(a[i] > b[j]){
				a[destination] = a[i];
				a[i] = 0;
				i--;
			}
			else{
				a[destination] = b[j];
				j--;
			}
			}
			else{
				a[destination] = b[j];
				j--;
			}
		}
		return a;
	}
}
