
public class BitVector {
	
	private int[] bits;
	BitVector(){
		bits = new int[1000];
	}

	public void setBit(int n){
		int arrayIndex = n/32;
		
		int temp = bits[arrayIndex];

		int bitIndex = n%32;

		temp |= (1<<bitIndex);

		bits[arrayIndex] = temp;

	}

	public void unsetBit(int n){
		int arrayIndex = n/32;
		int temp = bits[arrayIndex];
		int bitIndex = n%32;

		int zero = 0;
		temp &= ~(1<<bitIndex);

		bits[arrayIndex] = temp;
	}

	public boolean isSet(int n){
		int arrayIndex = n/32;
		
		int temp = bits[arrayIndex];

		int bitIndex = n%32;

		temp = temp>>bitIndex;

		if( (temp & 1) > 0){
			return true;
		}
		else{
			return false;
		}
	}

}
