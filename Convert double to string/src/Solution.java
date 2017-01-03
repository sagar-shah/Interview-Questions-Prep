// Given input between 0 and 1, return its binary representation in string format
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1;

		String result = convertToBinary(x);
		System.out.println(result);
		
		assert convertToBinary(0.76).equals("0.110000101000111101011100001010") : "Failed";
		assert convertToBinary(0.75).equals("0.11") : "Failed";
		assert convertToBinary(-0.75).equals("ERROR") : "Failed";
		assert convertToBinary(1.2).equals("ERROR") : "Failed";
		assert convertToBinary(1).equals("ERROR") : "Failed";
	}
	private static String convertToBinary(double x){
		if(x<=0 || x>=1) 
			return "ERROR";

		StringBuilder result = new StringBuilder();
		result.append("0.");
		while(x>0){
			if(result.length() == 32){
				return result.toString();
			}

			x = x * 2;
			if(x>=1){
				result.append("1");
				x = x - 1;
			}
			else{
				result.append("0");
			}
		}
		return result.toString();


	}

}
