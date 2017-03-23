import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args){
		String input = "31231234";
		
		List<String> ips = restoreIpAddresses(input);
		System.out.println(ips);
	}

	public static List<String> restoreIpAddresses(String s) {
		StringBuilder input = new StringBuilder(s);
		List<String> output = new ArrayList<String>();
//		int i=1,j=2,k=3;
		
		for(int i=1 ; i<s.length()-2; ++i){
			int part1 = Integer.parseInt(s.substring(0, i));
//			System.out.println(part1);
			if(part1>=0 && part1<=255){
				for(int j = i+1; j < s.length()-1 ; ++j){
					int part2 = Integer.parseInt(s.substring(i, j));
					if(part2>=0 && part2<=255){
						for(int k = j+1; k < s.length() ; ++k){
							int part3 = Integer.parseInt(s.substring(j, k));
							int part4 = Integer.parseInt(s.substring(k));
							
							if(part3>=0 && part3<=255 && part4>=0 && part4<=255){
//								System.out.println("valid");
								StringBuilder validIp = new StringBuilder(s);
								validIp.insert(i, '.');
								validIp.insert(j+1, '.');
								validIp.insert(k+2, '.');
								output.add(validIp.toString());
							}
						}
					}
					else break;
				}
			}
			else break;
		}
		
		return output;
    }
}
