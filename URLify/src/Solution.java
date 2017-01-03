
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Cracking the coding interview";
		
		String output = replaceSpaces(input);
		System.out.println(output);
	}

	private static String replaceSpaces(String input) {
		// TODO Auto-generated method stub
		if(input == null)
			return "";
		
		int noOfSpaces = countSpaces(input);
		char[] inputCharacters = new char[input.length() + (noOfSpaces*2)];
		int j = inputCharacters.length - 1;
		for( int i = input.length()-1 ; i>=0 ; i--){
			if(input.charAt(i) == ' '){
				inputCharacters[j--] = '0';
				inputCharacters[j--] = '2';
				inputCharacters[j--] = '%';
				
			}
			else{
				inputCharacters[j--] = input.charAt(i);
			}
		}
		
		return new String(inputCharacters);
		
	}

	private static int countSpaces(String input) {
		// TODO Auto-generated method stub
		int count = 0 ;
		for(int i = 0 ; i< input.length() ; i++){
			if(input.charAt(i) == ' ')
				count++;
		}
		
		return count;
	}

}
