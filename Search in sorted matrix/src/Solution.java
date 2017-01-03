
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			{6,12,18,24},
			{9,13,19,77},
			{19,23,50,80}
		};

		int value = 3;

		search(matrix,value);
	}
	private static void search(int[][] matrix,int value){
		int i = 0;
		int j = matrix[0].length -1;

		while(i<matrix.length && j<matrix[0].length && j>-1){
			if(matrix[i][j] == value){
				System.out.println("Value found at " +i + " " + j );
				return;
			}
			else if (matrix[i][j] < value){
				i++;
			}
			else{
				j--;
			}
		}
		System.out.println("Value not found");
	}

}
