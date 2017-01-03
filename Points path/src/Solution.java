import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 , j = 0 ;
		Point p = new Point(i,j);
		HashSet<Point> hs = new HashSet<Point>();
		hs.add(p);
		
		if(hs.contains(new Point(0,0))){
			System.out.println("contains");
		}else{
			System.out.println("not contain");
		}
		
	}

}
