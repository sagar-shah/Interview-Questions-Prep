public class Solution {
	public static void main(String[] args){
		int[] a = {-23,1,8,-22,-47,-46,-45,-44,100,200};
		int answer = findMinimumNotPresentInArray(a);
		System.out.println(answer);
	}
	private static int findMinimumNotPresentInArray(int[] a){
		int answer = a[0];
		for(int i=0 ; i< a.length ; i++){
			if(a[i] < answer - 1 ){
				answer = a[i];
			}
			if(a[i] == answer +1 ){
				answer = a[i];
			}
			
		}	
		return answer + 1;
	}
}
