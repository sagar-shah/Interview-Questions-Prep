//check here for testing - https://oeis.org/A006968/a006968.txt
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int i = 900;
		String roman = "";

		System.out.println(convertToRoman(i));
	}
	private static String convertToRoman(int num){

		if(num<=0){
			return "Cannot convert to roman";
		}

		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

		hm.put(1000,"M");
		hm.put(900,"CM");
		hm.put(500,"D");
		hm.put(400,"CD");
		hm.put(100,"C");
		hm.put(90,"XC");
		hm.put(50,"L");
		hm.put(40,"XL");
		hm.put(10,"X");
		hm.put(9,"IX");
		hm.put(5,"V");
		hm.put(4,"IV");
		hm.put(1,"I");

		StringBuilder roman = new StringBuilder();

		for(Map.Entry<Integer,String> me : hm.entrySet() ){
			int key = me.getKey();
			String value = me.getValue();

			int repeat = num / key;

			if( repeat > 0){
				while(repeat > 0){
					roman.append(value);
					repeat--;	
				}
				num = num%key;
			}	
		}

		return roman.toString();
	}
}
