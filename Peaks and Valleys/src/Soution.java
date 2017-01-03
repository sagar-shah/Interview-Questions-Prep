
public class Soution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {5,3,1,2,3};
		int[] a = {1,1,1,2,2,2}; 
//		int[] a = {1,2,3,4,5,6,7,8,9};

		
		int[] result = arrange(a);
		for ( int x : result){
			System.out.println(x);
		}
	}
	private static int[] arrange(int[] a){
		for(int i = 0 ; i < a.length - 2 ; i++){
			swap(a,i);
		}
		return a;
	}
	private static void swap(int[] a, int i){
		if( a[i] < a[i+1] && a[i+1] < a[i+2]){
			int temp = a[i+1];
			a[i+1] = a[i+2];
			a[i+2] = temp;
		}
		else if( a[i] > a[i+1] && a[i+1] > a[i+2] ){
			int temp = a[i+1];
			a[i+1] = a[i+2];
			a[i+2] = temp;
		}
	}

}
