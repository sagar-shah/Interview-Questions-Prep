//https://leetcode.com/problems/maximal-square/
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'1', '0', '1', '0'}, 
							{'1', '0', '1', '1'},
							{'1', '0', '1', '1'},
							{'1', '1', '1', '1'}
						};
		int maxSquare = maximalSquare(matrix);

		System.out.println(maxSquare);

	}
	private static int maximalSquare(char[][] matrix){
int maxSquare = 0;
		
		if(matrix.length == 0 || matrix[0].length == 0){
			return 0;
		}
		
		for(int i = 0 ; i < matrix[0].length ; i++){
			if(maxSquare < Character.getNumericValue(matrix[0][i])){
				maxSquare = Character.getNumericValue(matrix[0][i]);
				if(maxSquare == 1) break;
			}
		}		

		for(int i = 0 ;  i < matrix.length ; i++){
			if( maxSquare < Character.getNumericValue(matrix[i][0]) ){
				maxSquare = Character.getNumericValue(matrix[i][0]);
				if(maxSquare == 1) break;
			}
		}
			
		if( matrix.length < 2 || matrix[0].length < 2) return maxSquare;
		
		for(int i=1; i<matrix.length ; ++i){
			for(int j=1; j<matrix[0].length ; ++j){
				if(matrix[i][j] == '1'){
				// 	System.out.println(i + " " + j);
					if(matrix[i-1][j] == matrix[i][j-1] && matrix[i-1][j] == matrix[i-1][j-1]){
						matrix[i][j] = (char) (matrix[i-1][j] + 1);
					}
					else{
						if( matrix[i-1][j] < matrix[i][j-1] && matrix[i-1][j] < matrix[i-1][j-1] ){
							matrix[i][j] = (char) (matrix[i-1][j] + 1);
						}
						else if( matrix[i][j-1] < matrix[i-1][j-1] ){
							matrix[i][j] = (char) (matrix[i][j-1] + 1) ;
						}
						else{
							matrix[i][j] = (char) (matrix[i-1][j-1] + 1);
						}
					}
					if(Integer.parseInt((matrix[i][j] - '0') + "") > maxSquare){
						maxSquare = Integer.parseInt((matrix[i][j] - '0') + "");
					}
				}
			}
		}

		return maxSquare*maxSquare;
	} 
}

