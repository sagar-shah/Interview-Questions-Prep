
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex();
		g.addVertex();
		g.addVertex();
		g.addVertex();

		g.addDirectedEdge(0,1);
		g.addDirectedEdge(0,2);
		g.addDirectedEdge(1,2);
		g.addDirectedEdge(2,3);
		g.addDirectedEdge(3,3);

//		g.Bfs(3); //Bfs here will only read nodes that are accessible from this node
//		
//		g.Dfs(3); //Dfs here will only read nodes that are accessible from this node
		
		try{
		g.topoSort();
		}catch(CyclicGraphException e){
			System.out.println(e.getMessage());;
		}
		
		
	}

}
