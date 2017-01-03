import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		HashMap<Character, Character> h = new HashMap<Character, Character>();
		h.put('(', ')');
		h.put('{', '}');
		h.put('[', ']');
		h.put('<', '>');

		boolean isBalanced = check(str, h);
		System.out.println(isBalanced);
	}

	private static boolean check(String str, HashMap<Character, Character> h) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (h.containsKey(str.charAt(i))) {
				s.push(str.charAt(i));
			} else {
				if (!s.empty()) {
					char temp = s.pop();
					if (str.charAt(i) != h.get(temp)) {
						return false;
					}
				} else {
					return false;
				}
			}
		}

		if (!s.empty())
			return false;
		return true;
	}
}