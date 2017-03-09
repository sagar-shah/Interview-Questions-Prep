
public class TrieNode {
	public char c;
	public TrieNode[] successor = new TrieNode[26];
	public int prefixWords;
	public boolean isWord;
	
	TrieNode(char c){
		this.c = c;
//		for(char letter = 'a'; c<='z'; ++c){
//			successor[letter-'a'] = new TrieNode(letter);;
//		}
	}
}
