public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordChars = word.toCharArray();
        int m = board.length;
        int n = board[0].length;
        
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0; i<m ; ++i){
            for(int j=0 ; j<n ; ++j){
                if(exist(board,wordChars,i,j,visited,0,m,n)) return true;
            }
        }
        return false;
    }
    public static boolean exist(char[][] board,char[] wordChars,int i,int j,boolean[][] visited,int wordPtr,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && board[i][j] == wordChars[wordPtr] && !visited[i][j]){
            if(wordPtr == wordChars.length-1) return true;
            
            visited[i][j] = true;
            if(exist(board,wordChars,i,j+1,visited,wordPtr+1,m,n)) return true;;
            if(exist(board,wordChars,i+1,j,visited,wordPtr+1,m,n)) return true;
            if(exist(board,wordChars,i,j-1,visited,wordPtr+1,m,n)) return true;
            if(exist(board,wordChars,i-1,j,visited,wordPtr+1,m,n)) return true;
            visited[i][j] = false;
        }
        return false;
    }
}