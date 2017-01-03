public class Solution {
	public static void main(String[] args) {
		int m = 4, n = 4;
		int[][] island = { { 1, 1, 0, 0 }, 
							{ 1, 1, 0, 0 }, 
							{ 0, 1, 0, 1 }, 
							{ 1, 1, 0, 0 } };

		boolean[][] visited = new boolean[m][n];
		int count = countOfIslands(island, visited, m, n);
		System.out.println(count);
	}

	private static int countOfIslands(int[][] island, boolean[][] visited, int m, int n) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(visited[i][j] == false && island[i][j] == 1){
					traverse(island,visited,m,n,i,j);
					count++;
				}
			}
		}
		return count;
	}

	private static void traverse(int[][] island, boolean[][] visited, int m, int n,int i, int j) {
		// TODO Auto-generated method stub
		visited[i][j] = true;
		for(int row = i-1 ; row <= i+1  ; row++){
			for(int col= j-1; col <= j+1 ; col++){
				if(row>=0 && row<m && col>=0 && col<n && island[row][col] == 1 && !visited[row][col]){
				traverse(island,visited,m,n,row,col);
				}
			}
		}
	}
}