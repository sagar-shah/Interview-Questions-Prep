//https://www.careercup.com/question?id=5654319417262080
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6;
		int n = 2;
		
		int x = careerSolution(m,n);
		
		System.out.println(x);
	}
	public static int careerSolution(int m,int n){
		int[][] a = new int[m][n];
		
		int x = findPathCount(a,0,0,m,n);
		
		return x;
	}
	private static int findPathCount(int[][] a,int i,int j,int m,int n) {
		// TODO Auto-generated method stub
		if(i<m && j<n){
			return findPathCount(a, i+1, j, m, n) + findPathCount(a, i, j+1, m, n) + findPathCount(a, i+1, j+1, m, n);
		}
		if(i==m && j ==n)
			return 1;
		return 0;
	}
}
