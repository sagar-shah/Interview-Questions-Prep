
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "agbdba";
		int longest = getLongestPalinSubseq(input);
		System.out.println(longest);
	}

	private static int getLongestPalinSubseq(String input) {
		// TODO Auto-generated method stub
		int[][] dp = new int[input.length()][input.length()];
		
		for(int i=0;i<input.length();++i) dp[i][i] = 1;
		
		for(int len = 2 ; len <= input.length(); ++len){
			for(int i = 0 ; i<input.length() ; ++i){
				int j = i + len - 1 ;
				if(j>=input.length()) break;
				if(input.charAt(i) != input.charAt(j)){
//					System.out.println("j"+j);
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
				}
				else{
					dp[i][j] = dp[i+1][j-1] + 2;
				}
			}
		}
		return dp[0][input.length()-1];
	}

}
