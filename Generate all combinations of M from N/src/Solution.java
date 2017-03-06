import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> letters = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));
		int m = 4;
		ArrayList<String> result = new ArrayList<>();
		getAllCombinationsOfM(letters,m,result);
		
		System.out.println(result);
	}
	public static void getAllCombinationsOfM(ArrayList<String> letters,int m,ArrayList<String> result){

		if(m==1){
			ArrayList<String> newList = new ArrayList<>();
			for(String s:letters){
				newList.add(s);
			}
			result.addAll(newList);
			return;
		}
		getAllCombinationsOfM(letters,m-1,result);
		
		ArrayList<String> newList = new ArrayList<>();
		for(String s : result){
//			System.out.println("s= " + s);
			String lastLetter = Character.toString(s.charAt(s.length()-1));
			int lastLetterIndex = letters.indexOf(lastLetter);
			for(int i = lastLetterIndex+1; i<letters.size(); i++){
//				System.out.println("s+letter= "+s + letters.get(i));
				newList.add(s + letters.get(i));
			}
		}
//		System.out.println(newList);
		result.clear();
		result.addAll(newList);
//		System.out.println(result);
		
		return;
	} 

}
