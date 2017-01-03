
public class Point {
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int hashCode(){
		int prime = 31;
		int result = 1 ;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(!( o instanceof Point))
			return false;
		if(this == o)
			return true;
		
		Point temp = (Point) o;
		if(x != temp.x)
			return false;
		if(y != temp.y)
			return false;
		
		return true;
			
	}


}
