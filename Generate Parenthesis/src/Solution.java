import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> allParantheses = generateParenthesis(n);

		System.out.println(allParantheses);
	}
	private static List<String> generateParenthesis(int n){
		List<String> list = new LinkedList<String>();
		return generateAllParenthesis(list,"",0,0,n);
	} 
	private static List<String> generateAllParenthesis(List<String> list,String str, int open, int close, int max){
		if( open == max && close == max){
			list.add(str);
			return list;
		}
		if(open < max ){
			str = str + "(";
			generateAllParenthesis(list,str,open+1,close,max);
			str = str.substring(0,str.length()-1);
		}
		if(open>close && close< max){
			str = str + ")";
			generateAllParenthesis(list,str,open,close+1,max);
			str = str.substring(0,str.length()-1);
		}
		return list;
	}

}
