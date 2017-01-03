
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);

		g.addEdge(0, 1);
		g.addEdge(0, 3);	
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(3, 2);
		g.topologicalSort(); 
	}

}
