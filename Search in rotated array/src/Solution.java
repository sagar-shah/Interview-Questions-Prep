
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {4,5,6,7,9,10,1,2,3};
		int [] a = {2,2,2,3,4,2};
		
		int searchNo = 3;
		if(search(a,searchNo,0,a.length-1)){
			System.out.println("Number found");
		}
		else{
			System.out.println("Not found");
		}

	}
	public static boolean search(int[] a,int searchNo,int i,int j){
		if(i>j){
			return false;
		}

		int mid = (i + (j - i)/2);

		if(a[mid] == searchNo)
			return true;

		if(a[i] == a[mid]){
			return search(a,searchNo,mid+1,j);
		}
		if(a[mid] == a[j]){
			return search(a,searchNo,i,mid-1);
		}
		if(a[i] == a[mid] && a[mid] == a[j]){
			return search(a,searchNo,mid+1,j) || search(a,searchNo,i,mid-1);
		}

		if(searchNo >= a[i] && searchNo <= a[mid-1]){ 
			return search(a,searchNo,i,mid-1);
		}

		else if(searchNo >= a[mid+1] && searchNo <= a[j]){ 
			return search(a,searchNo,mid+1,j);
		}


		else if(a[i] <= a[mid]){
			return search(a,searchNo,mid+1,j);
		}
		else{
			return search(a,searchNo,i,mid-1);
		}

	}

}
