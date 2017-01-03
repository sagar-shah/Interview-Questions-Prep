
public class Solution {
	public static void main(String args[]){
		int[] a = {3,6,9,12};

		int findNum = 12;

		System.out.println(getPosition(a,findNum,1,0));
	}
	private static int getPosition(int[] a,int findNum,int currentIndex,int baseIndex){
		if(baseIndex + currentIndex > a.length){
			if(baseIndex > a.length -1 ){
				return -1;
			}
			return getPosition(a,findNum,1,baseIndex + currentIndex/2);
		}

		if(a[baseIndex + currentIndex-1] == findNum){
			return baseIndex + currentIndex;
		}

		if(a[baseIndex + currentIndex-1] < findNum){
			return getPosition(a,findNum,currentIndex*2,baseIndex);	
		}
		else{
			if(baseIndex + currentIndex / 2 == baseIndex){
				return -1;
			}
			return getPosition(a,findNum,1,baseIndex + currentIndex/2);
		}
		
	}
}
