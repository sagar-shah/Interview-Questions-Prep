import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";

		LinkedList<String> allPermutations = getAllPermutations(input);

		for(String s : allPermutations){
			System.out.println(s);
		}
	}
	private static LinkedList<String> getAllPermutations(String input){

		LinkedList<String> returnList = new LinkedList<String>();
		
		if(input.length() == 0)
			return returnList;
		if(input.length() == 1){
			returnList.add(input);
			return returnList;
		}
			

		String str0 = Character.toString(input.charAt(0));
		String str = input.substring(1);

		LinkedList<String> list = getAllPermutations(str);
		
		for(String s : list){
			for(int i=0; i<s.length(); i++){
				String temp = s.substring(0,i) + str0 + s.substring(i);
				returnList.add(temp);
			}
			returnList.add(s+str0);
		}
		return returnList;
	}

}
