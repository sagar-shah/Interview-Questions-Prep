
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "234234";
		int num = parseString(s);
		System.out.println(num);
		Integer.parseInt(s);
	}

	private static int parseString(String s) throws RuntimeException {
		// TODO Auto-generated method stub
		if(s==null){
			throw new RuntimeException();
		}
		
		int multiplier = 1;
		if(s.charAt(0)=='-'){
			multiplier = -1;
			s =s.substring(1);
		}
		else if(s.charAt(0)=='+'){
			s=s.substring(1);
		}
		
		int num = 0;
		for(char c:s.toCharArray()){
			if(!Character.isDigit(c)) throw new RuntimeException();
			num = num*10 + (c-'0');
		}
		return num*multiplier;
	}

}
