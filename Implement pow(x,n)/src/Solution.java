import java.util.HashMap;

public class Solution {
    public double myPow(double x, int n) {
    	HashMap<Integer,Double> mem = new HashMap<Integer,Double>();
    	return myPow(x, n,mem);
    
    	
    }

	private double myPow(double x, int n, HashMap<Integer, Double> mem) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
    	else if(n==1) return x;
    	else if (n==-1) return 1/x;

    	if(!mem.containsKey(n/2)){
    		mem.put(n/2, myPow(x, n/2, mem));
    	}
    	return mem.get(n/2)*mem.get(n/2)*myPow(x, n%2,mem);
    	
	}
}