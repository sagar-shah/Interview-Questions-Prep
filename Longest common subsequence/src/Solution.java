
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLongestCommonSubseq("GXTXAYB","AGGTAB"));
	}

	private static int getLongestCommonSubseq(String string1, String string2) {
		// TODO Auto-generated method stub
		int[][] dp = new int[string1.length()+1][string2.length()+1];
		
		for(int i=1; i<string1.length()+1 ; ++i){
			for(int j=1; j<string2.length()+1 ; ++j){
				if(string1.charAt(i-1)==string2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[string1.length()][string2.length()];
	}

}
