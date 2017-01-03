import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] boggle = { { 'G', 'I', 'Z','R' }, { 'U', 'E', 'K','A' }, { 'Q', 'S', 'E','M' }, {'A','B','C','D'} };

		int m = 4, n = 4;
		boolean[][] visited = new boolean[m][n];
		String s = "";
		HashSet<String> h = new HashSet<String>();
		h.add("GEEKS");
		h.add("QUIZ");
		h.add("CAR");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				check(boggle, i, j, h, visited, s,m,n);
				clear(visited,m,n);
				s = "";
			}
		}

	}	

	private static void clear(boolean[][] visited,int m,int n) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<m ; i++){
			for(int j=0 ; j<n; j++){
				visited[i][j] = false;
			}
		}
	}

	private static void check(char[][] boggle, int i, int j, HashSet<String> h, boolean[][] visited, String s, int m , int n) {
		// TODO Auto-generated method stub
		if (i>=0 && i<m && j>=0 && j<n && visited[i][j] == false) {
			s = s + boggle[i][j];
			visited[i][j] = true;
			if (h.contains(s)) {
				System.out.println(s);
			}
			check(boggle, i-1, j, h, visited, s,m,n);
			check(boggle, i+1, j, h, visited, s,m,n);	
			check(boggle, i, j-1, h, visited, s,m,n);
			check(boggle, i, j+1, h, visited, s,m,n);
			check(boggle, i-1, j-1, h, visited, s,m,n);
			check(boggle, i+1, j-1, h, visited, s,m,n);
			check(boggle, i+1, j+1, h, visited, s,m,n);
			check(boggle, i-1, j+1, h, visited, s,m,n);
			visited[i][j] = false;
		}
	}

}
