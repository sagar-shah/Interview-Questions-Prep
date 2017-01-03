import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] units = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens = {"", "ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String hundred = "hundred";
		String[] biggerTerms = {"","thousand","million","billion"};

		String input = "-50005";
		//Test 100,000  50,005

		printWords(input,units,tens,biggerTerms,hundred);
	}
	public static void printWords(String input,String[] units,String[] tens,String[] biggerTerms,String hundred){

		String finalOutput = "";
		String preappend = "";
		if(input.charAt(0) == '-'){
			preappend = "Negative ";
			input = input.substring(1);
		}
		 
		
		while(input.length() % 3 != 0){
			input = "0" + input;
		}

		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i = 0; i<input.length(); i = i+3){
			al.add(Integer.parseInt(input.substring(i,i+3)));
		}

		for(int i=al.size()-1 ; i>=0 ; i--){
			String output = "";
			int num = al.get(i);

			int h = num / 100;
			if(h>0){
				output += " " + units[h] + " " + hundred;
			}

			int d = num%100;
			d = d / 10;

			if(d>0){
				if(d == 1){
					output += " " + units[num%100];
					output = output + " " + biggerTerms[al.size()-1-i];
					finalOutput = output + finalOutput;
					continue;
				}
				else{
					if(h!=0){
						output += " and";
					}
					output += " " + tens[d];
				}
			}

			d = num%10;
			if(d > 0){
				output += " " + units[d];
			}

			output = output + " " + biggerTerms[al.size()-1-i];

			finalOutput = output + finalOutput;
		}
		
		System.out.println(preappend + finalOutput);


	}

}
