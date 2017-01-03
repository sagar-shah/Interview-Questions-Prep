
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;

		
		while(b>0){
			int c = a ^ b;
			b = (a & b)<<1;
			a = c;
		}
		System.out.println(a);
	}

}
