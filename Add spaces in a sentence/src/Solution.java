import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "therearefourwords";
		HashSet<String> dictionary = new HashSet<>();
		dictionary.add("the");
		dictionary.add("there");
		dictionary.add("are");
		dictionary.add("four");
		dictionary.add("words");
		
		StringBuilder output = new StringBuilder();
		
		putSpaces(input, output, dictionary, 0, 1);
		System.out.println(output.reverse().toString().trim());
	}

	private static boolean putSpaces(String input, StringBuilder output, HashSet<String> dictionary, int i, int j) {
		// TODO Auto-generated method stub
//		System.out.println("i= "+i+ "  j= "+j);
//		System.out.println(output.toString());

		while(i<input.length() && j<=input.length()){
			String word = input.substring(i, j);
			
			if(dictionary.contains(word)){
				if(j ==input.length() ){
					output.append(new StringBuilder(word).reverse());
					output.append(" ");
					return true;
				}
				
				boolean isSuccessful = putSpaces(input, output, dictionary, j, j+1);
				if(isSuccessful){
					output.append(new StringBuilder(word).reverse());
					output.append(" ");
					return true;
				}
			}
			j++;
		}
		return false;
	}

}
