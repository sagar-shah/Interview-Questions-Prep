import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	public int Vertexes;
	public LinkedList<Integer>[] adj;
	boolean[] visited;

	public Graph(int n) {
		Vertexes = n;
		adj = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new LinkedList<Integer>();
		}
		visited = new boolean[n];

	}

	public void addEdge(int i, int j) {
		adj[i].addFirst(j);
	}

	public void Bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(node);

		while (!q.isEmpty()) {
			node = q.poll();
			System.out.println(node + " ");
			visited[node] = true;
			LinkedList<Integer> l = adj[node];
			Iterator<Integer> i = l.iterator();
			while (i.hasNext()) {
				int temp = i.next();
				if (visited[temp] == false) {
					q.offer(temp);
				}
			}
		}

		// clear visited array
		clear();
	}

	public void clear() {
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}

	}

	public void Dfs(int node) {
		visited[node] = true;
		System.out.println(node);

		Iterator<Integer> i = adj[node].iterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				Dfs(n);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);

		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		

		g.Bfs(0);
		System.out.println("------------------------");
		g.Dfs(0);
		g.clear();
	}

}
