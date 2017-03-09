
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.addWord("test");
		t.addWord("tesla");
		
//		System.out.println(t.getNoOfWordsWithPrefix("tesla"));
		
		System.out.println(t.isWord("tesl"));
	}

}
