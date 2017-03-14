
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "wwwwaaadexxxxxx";
		System.out.println(minifyString(input));
	}

	private static String minifyString(String input) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		char[] inputChars = input.toCharArray();
		
		if(input == null || input.equals("")){
			return "String empty";
		}
		
		if(input.length() == 1){
			sb.append(input);
			sb.append("1");
			return sb.toString();
		}
		
		int count = 1;
		
		for(int i=0 ; i < inputChars.length - 1 ; ){
			sb.append(inputChars[i]);
			while(inputChars[i+1] == inputChars[i]){
				count++;
				i++;
				if(i == inputChars.length - 1){
					sb.append(count);
					return sb.toString();
				}
			}
			sb.append(count);
			count = 1;
			i++;
		}
		//last character check if not repeated
		if(inputChars[inputChars.length - 1] != inputChars[inputChars.length - 2]){
			sb.append(inputChars[inputChars.length - 1]);
			sb.append("1");
			return sb.toString();
		}
		
		
		return sb.toString();
		
		
		
	}

}
