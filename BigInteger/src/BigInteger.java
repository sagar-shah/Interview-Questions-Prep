
public class BigInteger {
	private String number;
	
	BigInteger(String str){
		this.number = str;
	}
	
	public String getNumber(BigInteger b){
		return b.number;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	public BigInteger add(BigInteger num){
		int carry = 0;
		
		String  num2 = num.getNumber(num);
		StringBuilder sum = new StringBuilder();
		int i = 0, j=0;
		for(i=number.length() - 1, j = num2.length() - 1 ; i >= 0 && j >= 0; i--, j--){
			int x = Integer.valueOf(Character.toString(number.charAt(i)));
			int y = Integer.valueOf(Character.toString(num2.charAt(j)));
			//System.out.println("x " + x + "  y   " + y);
			int digit = (x + y + carry)%10;
			sum = sum.append(Integer.toString(digit));
			
			carry = (x + y + carry)/10;
			
			
		}
		if( i < 0){
			while(j>=0){
				int y = Integer.valueOf(Character.toString(num2.charAt(j)));
				int digit = (y + carry)%10;
				sum = sum.append(Integer.toString(digit));
				carry = (y + carry)/10;
				j--;
			}
		}
		else if(j < 0){
			while(i>=0){
				int x = Integer.valueOf(Character.toString(number.charAt(i)));
				int digit = (x + carry)%10;
				sum = sum.append(Integer.toString(digit));
				carry = (x + carry)/10;
				i--;
			}
		}
		if(carry == 1){
			sum.append(Integer.toString(carry));
		}
		
		return new BigInteger(sum.reverse().toString());
	}
}
