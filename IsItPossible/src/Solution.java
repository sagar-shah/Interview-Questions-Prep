
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 1,b=4,c=5,d=9;
		isitpossible(a,b,c,d);

	}
	public static void isitpossible(int a, int b, int c, int d) {
		Boolean flag = new Boolean(false);
	    flag = isitpossible(a, b, c, d, flag);
		if(flag == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		//return result;
    }
	public static Boolean isitpossible(int a, int b, int c, int d, Boolean flag) {
		// TODO Auto-generated method stub
		if(a == c && b == d){
			flag = true;
			return flag;
		}
		if(a > c || b > d){
			flag = false;
			return flag;
		}
		
		return 	isitpossible(a+b,b,c,d,flag) || isitpossible(a,a+b,c,d,flag);
	}
	
}
