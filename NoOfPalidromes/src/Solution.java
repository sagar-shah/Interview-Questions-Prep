import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaba";
		int n = palindrome(str);
		System.out.println(n);
	}
	public static int palindrome(String str)
	{
		HashSet<String> h = new HashSet<String>();
		for(int i = 0 ; i < str.length() ; i++){
			for(int j = i ; j <str.length() ; j++){
				boolean isPalin = isPalindrome(str,i,j);
				if(isPalin == true){
					String subString;
					if(j==str.length() - 1)
						subString = str.substring(i);
					else
						subString = str.substring(i, j+1);
					
					h.add(subString);
				}
			}
		}
		
		
		return h.size();
	}
	public static boolean isPalindrome(String str, int i, int j){
		
		while(i<=j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
