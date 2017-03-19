
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] obstacleGrid = {
				{0,0,0},
				  {0,1,0},
				  {0,0,0}
								};
		
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid == null)	return 0;
		
		int m = obstacleGrid.length;
		int n = 0;
		if(m>0)
			n = obstacleGrid[0].length;
		if(n == 0) return 0;
		
		if(m>0&& n>0)
			if(obstacleGrid[0][0] == 1) return 0;
		
		int count = 0;
		int[][] cache = new int[m][n];
		for(int i=0 ; i<m ; ++i){
			for(int j=0; j<n ; ++j){
				cache[i][j] = -1;
			}
		}
		
		return uniquePathsWithObstacles(obstacleGrid,0,0,m,n,count,cache);
    }
	public static int uniquePathsWithObstacles(int[][] obstacleGrid,int i, int j, int m, int n,int count,int[][] cache) {
		// TODO Auto-generated method stub
		if( i==m || j==n){
			return count;
		}
		if(i==m-1 && j == n-1){
			if(obstacleGrid[i][j] == 1){
				return count;
			}
			
			count++;
			return count;
		}
		if(cache[i][j]!=-1){
			return cache[i][j];
		}
		
		int rightCount = 0;
		int leftCount = 0;
		if(j+1<n &&  obstacleGrid[i][j+1] == 0 ){
				rightCount = uniquePathsWithObstacles(obstacleGrid, i, j+1, m, n, count,cache);
		}
		if(i+1<m && obstacleGrid[i+1][j] == 0){
				leftCount = uniquePathsWithObstacles(obstacleGrid, i+1, j, m, n, count,cache);

		}
		cache[i][j] = leftCount + rightCount;
		
		
		return cache[i][j];
	}

}
