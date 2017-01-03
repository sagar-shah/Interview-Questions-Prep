import java.util.*;

public class Solution{
	static boolean found = false;
	public static void main(String args[]){
		int r = 7,c = 7;
		int grid[][] = new int[r][c];

		Point source = new Point(0,0);
		Point destination = new Point(r-1,c-1);

		List<Point> path = getPath(grid,source,destination,r,c);
		System.out.println(path.size());
	}
	public static List<Point> getPath(int grid[][],Point source,Point destination,int r,int c){
		List<Point> path = new LinkedList<Point>();
		return getPathHelper(grid,source,destination,path,r,c);
	}
	public static List<Point> getPathHelper(int grid[][],Point current,Point destination,List<Point> path,int r, int c){
		if(current.row>=r || current.column >= c || (current.row == 6 && current.column == 4)) 
			return path;
		
		
		path.add(current);
		if(current.row == destination.row && current.column == destination.column){
			// path.add(current);
			System.out.println("found");
			found = true;
			return path;
		}
		if (!found) {
			Point nextPoint = new Point(current.row+1,current.column);
			System.out.println(current.row + "  " + current.column);
			path = getPathHelper(grid,nextPoint,destination,path,r,c);
			if (found)
				return path;

		}
		if (!found) {
			Point nextPoint = new Point(current.row,current.column+1);
			System.out.println(current.row + "  " + current.column);
			path = getPathHelper(grid,nextPoint,destination,path,r,c);
			if (found)
				return path;

			

		}
		if(!found){
			((LinkedList<Point>) path).removeLast();
		}
		return path;
	}
}

