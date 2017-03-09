
public class Trie {
	
	private TrieNode root = new TrieNode(' ');
	
	public void addWord(String word){
		TrieNode t = root;
		char[] wordArray = word.toCharArray();
		for(int i=0; i<wordArray.length; ++i){
			char c = wordArray[i];
			if(t.successor[c-'a']==null){
				t.successor[c-'a'] = new TrieNode(c);				
			}
			
			t = t.successor[c-'a'];
			t.prefixWords += 1;
			
			if(i==wordArray.length-1){
				t.isWord = true;
			}
		}
	}
	
	public int getNoOfWordsWithPrefix(String prefix){
		TrieNode t = root;
		char[] prefixArray = prefix.toCharArray();
		
		for(int i=0; i<prefixArray.length ; ++i){
			char c = prefixArray[i];
			t = t.successor[c-'a'];
			if(t == null){
				return -1;
			}
		}
		return t.prefixWords;
	}

	public boolean isWord(String word) {
		// TODO Auto-generated method stub
		TrieNode t = root;
		char[] wordArray = word.toCharArray();
		
		for(int i=0; i<wordArray.length ; ++i){
			char c = wordArray[i];
			t = t.successor[c-'a'];
			if(t == null){
				return false;
			}
		}
		return t.isWord;
	}
	
	
}
