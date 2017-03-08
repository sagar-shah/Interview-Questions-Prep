
public class CyclicGraphException extends Exception {
	private String message;
	public CyclicGraphException(String msg) {
		// TODO Auto-generated constructor stub
		this.message = msg;
	}
	public String getMessage(){
		return this.message;
	}
}
