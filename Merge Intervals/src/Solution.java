import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assuming intervals are sorted by the start. If not, then sort by start 
		Interval i1 = new Interval(1,4);
		Interval i2 = new Interval(0,2);
		Interval i3 = new Interval(3,5);
//		Interval i4 = new Interval(8,10);
		
		LinkedList<Interval> intervals = new LinkedList<>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
//		intervals.add(i4);
		
		System.out.println(intervals);
		
		Collections.sort(intervals);
		merge(intervals);
		System.out.println(intervals);
	}
	public static List<Interval> merge(List<Interval> intervals) {
        
		if(intervals == null) return null;
		
		for(int i=0 ; i < intervals.size() - 1 ; ){
			Interval current = intervals.get(i);
			Interval next = intervals.get(i+1);
			
			if(next.start >= current.start && next.start <= current.end && next.end >= current.start && next.end <= current.end){
				intervals.remove(i+1);
			}
			else if(next.start <= current.end && next.end >= current.end){
//				System.out.println(current);
//				System.out.println(next);
				
				intervals.remove(i);
				intervals.remove(i);
				Interval newInterval = new Interval(current.start,next.end);
				intervals.add(i, newInterval);
			}
			else ++i;
			
		}
		
		return intervals;
    }

}
