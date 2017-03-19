
public class Interval implements Comparable<Interval> {
	int start;
	 int end;
	 Interval() { start = 0; end = 0; }
	 Interval(int s, int e) { start = s; end = e; }
	 
	 public String toString(){
		 return "[" +this.start + "," + this.end + "]";
	 }
	 
	 public int compareTo(Interval i2){
		 if(this.start == i2.start) return 0;
		 else if (this.start < i2.start) return -1;
		 else return 1;
	 }
}
