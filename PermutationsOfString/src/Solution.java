import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaba";
		// System.out.println(str.substring(3, 3 ));
		HashSet<String> h = new HashSet<String>();
		permute(str, "", h);
	}

	private static void permute(String str1, String str2, HashSet<String> h) {

		h.add(str2);

		if (str1.equals("")) {
			System.out.println(str2);
			return;
		}
		for (int i = 0; i < str1.length(); i++) {
			String temp2 = str2 + String.valueOf(str1.charAt(i));
			String temp1 = str1.substring(0, i) + str1.substring(i + 1, str1.length());
			if (!h.contains(temp2)) {
				permute(temp1, temp2, h);
			}
		}
	}

}
