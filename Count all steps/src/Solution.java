
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int answer = getAllSteps(n);

		System.out.println(answer);
	}
	public static int getAllSteps(int n){
		return getAllSteps(n,new int[n+1]);
	}
	
	public static int getAllSteps(int n, int mem[]){
//		if(n==4) return 4;
//		if(n==3) return 2;
//		if(n==2) return 1;
//		
//		int x,y,z;
//		
//		if(mem[n-1] != 0)
//			x = mem[n-1];
//		else
//			x = getAllSteps(n-1,mem);
//		
//		if(mem[n-2] != 0)
//			y = mem[n-2];
//		else
//			y = getAllSteps(n-2,mem);
//		
//		if(mem[n-3] != 0)
//			z = mem[n-3];
//		else
//			z = getAllSteps(n-3,mem);
//		
//		mem[n] = x+y+z;
////		if(n==1 || n==0) return 1;
//
//		return mem[n];
		if (n<0) return 0;
		if (n==0) return 1;
		return getAllSteps(n-1, mem)+getAllSteps(n-2, mem)+getAllSteps(n-3, mem);
		
	}

}
