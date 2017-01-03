import java.util.*;
public class Solution {
	public static void main(String[] args) {
		String[] words = {"abc","wer","xxyz","mnop","xyzx","cba","b","a","zse","sez"};

		String[] sortedAnagrams  = sortAnagrams(words);
		for(String s : sortedAnagrams)
			System.out.println(s);
	}
	public static String[] sortAnagrams(String[] words){
		HashMap<String,LinkedList<String>> hm = new HashMap<String,LinkedList<String>>();
		for(String word : words){
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);

			if(hm.containsKey(sortedWord)){
				LinkedList<String> list = hm.get(sortedWord);
				list.add(word);
			}
			else{
				LinkedList<String> l = new LinkedList<String>();
				l.add(word);
				hm.put(sortedWord,l);
				
			}

		}

		String[] sortedAnagrams = new String[words.length];
		int i = 0;
		for(LinkedList<String> list : hm.values()){
			for(String s : list){
				sortedAnagrams[i] = s;
				i++;
			}
		}

		return sortedAnagrams;

	}
}
