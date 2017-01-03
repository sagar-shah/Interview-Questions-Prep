import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	private int noOfNodes;
	private boolean[] visited;
	private LinkedList<Integer>[] adj;

	public Graph(int size) {
		noOfNodes = size;
		visited = new boolean[noOfNodes];
		adj = new LinkedList[noOfNodes];
		for (int i = 0; i < adj.length; ++i) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}

	public void Dfs(int node) {
		DfsHelper(node);
		clearVisited();

	}

	private void clearVisited() {
		// TODO Auto-generated method stub
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
	}

	private void DfsHelper(int node) {
		visited[node] = true;
		System.out.println(node);

		LinkedList<Integer> l = adj[node];
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			int n = i.next();
			if (visited[n] == false) {
				DfsHelper(n);
			}
		}
	}

	public void Bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(node);

		while (!q.isEmpty()) {
			int n = q.poll();
			if (visited[n] == false) {
				System.out.println(n);
				visited[n] = true;
				LinkedList<Integer> l = adj[n];
				Iterator<Integer> i = l.iterator();
				while (i.hasNext()) {
					int z = i.next();
					if (visited[z] == false) {
						q.offer(z);
					}
				}
			}
		}

		clearVisited();
	}

	public void topologicalSort() {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < noOfNodes; i++) {
			if (visited[i] == false) {
				topoUtil(i,s);
			}
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

	private void topoUtil(int i,Stack<Integer> s) {
		// TODO Auto-generated method stub
		visited[i] = true;
		LinkedList<Integer> l = adj[i];
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			int n = it.next();
			if(visited[n] == false){
				topoUtil(n, s);
			}
		}
		s.push(i);
	}

}
