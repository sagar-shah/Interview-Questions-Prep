import java.util.*;

public class Graph {
	ArrayList<ArrayList<Integer>> vertices = new ArrayList<>();
	private int nodeNumber = 0;
	
	public void addVertex(){
		vertices.add(new ArrayList<Integer>());
		System.out.println("Vertex added "+nodeNumber++);
	}

	public void addDirectedEdge(int i, int j){
		vertices.get(i).add(j);
		System.out.println("Edge added from "+i+" to "+j);
	}

	public void Bfs(int startNode){
		boolean[] visited = new boolean[nodeNumber];

		Queue<Integer> q = new LinkedList<>();

		q.offer(startNode);
		visited[startNode] = true;

		while(!q.isEmpty()){
			int node = q.poll();
			System.out.println(""+node);
			
			ArrayList<Integer> neighbours = vertices.get(node);
			for(int neighbour:neighbours){
				if(!visited[neighbour]){
					visited[neighbour] = true;
					q.offer(neighbour);
				}
			}
		}
	}
	
	public void Dfs(int startNode){
		boolean[] visited = new boolean[nodeNumber];

		Stack<Integer> s = new Stack<>();

		s.push(startNode);
		visited[startNode] = true;

		while(!s.isEmpty()){
			int node = s.pop();
			System.out.println(""+node);
			
			ArrayList<Integer> neighbours = vertices.get(node);
			for(int neighbour:neighbours){
				if(!visited[neighbour]){
					visited[neighbour] = true;
					s.push(neighbour);
				}
			}
		}
	}
	
	public void topoSort() throws CyclicGraphException{
		
		if(checkIfCyclic()){
			throw new CyclicGraphException("Cycle detected");
		}
		
		boolean[] visited = new boolean[nodeNumber];
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<visited.length ; ++i){
			if(!visited[i]){
				topoUtil(s,visited,i);
			}
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		
	}
	public boolean checkIfCyclic(){
		boolean[] visited = new boolean[nodeNumber];
		HashSet<Integer> nodesInCurrentPath = new HashSet<>();
		for(int i=0; i<visited.length ; ++i){
			if(!visited[i]){
				return DfsRecursive(nodesInCurrentPath,visited,i);
			}
		}
		return false;
	}
	
	private boolean DfsRecursive(HashSet<Integer> nodesInCurrentPath, boolean[] visited, int i) {
		// TODO Auto-generated method stub
		if(nodesInCurrentPath.contains(i)){
			return true;
		}
		if(!visited[i]){
			for(int neighbour: vertices.get(i)){
				if(!visited[i]){
					nodesInCurrentPath.add(i);
					boolean isCyclic = DfsRecursive(nodesInCurrentPath, visited, neighbour);
					if(isCyclic){
						return true;
					}
					nodesInCurrentPath.remove(i);
				}
			}
			visited[i] = true;
		}
		return false;
		
	}

	public void topoUtil(Stack<Integer> s,boolean[] visited, int i){
		if(!visited[i]){
			for(int neighbour: vertices.get(i)){
				if(!visited[i]){
					topoUtil(s, visited, neighbour);	
				}
			}
			visited[i] = true;
			s.push(i);
		}
		return;
	}


}
