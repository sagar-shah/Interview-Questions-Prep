
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"at","","","","ball","","","","car","","",""};
		String searchWord = "at";

		search(words,searchWord,0,words.length-1);

	}
	public static void search(String[] words,String searchWord,int i,int j){
		while(i<=j){
			int mid = (i + j)/2;
			int tempmid = mid;

			while(words[tempmid].equals("")){
				
				tempmid++;
				if(tempmid == j){
					tempmid = mid;
					while(words[tempmid].equals("")){
						tempmid--;
						if(tempmid == i-1){
							System.out.println("Not found");
							return;
						}
					}
				}		
			}

			mid = tempmid;

			if(words[mid].equals(searchWord)){
				System.out.println("Found at " + mid);
				return;
			}

			if(searchWord.charAt(0) < words[mid].charAt(0)){
				j = mid - 1;
			}
			else{
				i = mid + 1;
			}
		}
	}

}
