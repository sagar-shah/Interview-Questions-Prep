public class Solution{
	public static void main(String[] args){
		String str = "-154";
		int number = convertToInt(str);
		System.out.println(number);
	}

	private static int convertToInt(String str) {
		// TODO Auto-generated method stub
		int isNegative=0;
		if(str.charAt(0) == '-'){
			isNegative = 1;
		}
		int sum = 0;
		for(int i=isNegative ; i<str.length() ; i++){
			char c = str.charAt(i);
			sum += ((c - '0') * Math.pow( 10, str.length() - i - 1 ));
		}
		if(isNegative == 1){
			return sum*-1;
		}
		return sum;
	}
}