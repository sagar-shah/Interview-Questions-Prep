//Given a matrix, you need to create another matrix such that the value (i,j) is either -1, 0 or 1.
//1 - if multiplication of all values in ith row and jth column is greater than 0.
//-1 - if multiplication of all values in ith row and jth column is less than 0.
//0 - if multiplication of all the values in ith row and jth column is 0.
//
//e.g.
//1 2 3 1
//1 0 -1 2
//-1 1 1 1
//
//o/p
//-1 0 -1 1
//0 0 0 0
//1 0 1 -1

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3, n=4;
		int[][] a = {{1,2,3,4},
				     {-1,-2,-3,-4},
				     {0,5,0,-6}};
		int[][] res = transformmatrix(a,m,n);
		print(res,m,n);
	}

	private static void print(int[][] a,int m, int n) {
		// TODO Auto-generated method stub
		for(int i= 0; i<m ; i++){
			for(int j=0; j<n ; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] transformmatrix(int[][] a, int m, int n) {
		int[][] res = new int[m][n];
		// TODO Auto-generated method stub
		for(int i=0 ; i< m; i++){
			for(int j=0 ; j< n ; j++){
				res[i][j] = getRowColumnMultiplication(a,i,j, m, n);
			}
		}
		
		return res;
	}

	private static int getRowColumnMultiplication(int[][] a, int i, int j, int m, int n) {
		// TODO Auto-generated method stub
		int irow = 1, jcolumn = 1;
		for(int c = 0; c < n ; c++){
			irow *= check(a[i][c]);
		}
		for(int c = 0 ; c< m; c++){
			jcolumn *= check(a[c][j]);
		}
		if(irow*jcolumn > 0)
			return 1;
		else if (irow * jcolumn < 0)
			return -1;
		else
			return 0;
	}

	private static int check(int i) {
		// TODO Auto-generated method stub
		if(i>0)
			return 1;
		else if (i<0)
			return -1;
		else
			return 0;
	}

}

		
		