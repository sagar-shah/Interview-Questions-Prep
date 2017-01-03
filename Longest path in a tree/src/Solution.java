import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = ConstructTree();
		
		int longestpath  = calculateLongestPath(root);
		System.out.println(longestpath);
	}
	private static int calculateLongestPath(Node root) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int maxPath = 0;
		while(!q.isEmpty()){
			Node t = q.poll();
			int max = findLongestPath(t.left) + findLongestPath(t.right) + 1;
			if(max > maxPath)
				maxPath = max;
			if(t.left != null)
				q.offer(t.left);
			if(t.right!=null)
				q.offer(t.right);
		}
		
		return maxPath;
		
	}
	private static int findLongestPath(Node node) {
		// TODO Auto-generated method stub
		if(node == null)
			return 0;
		
		return Math.max(findLongestPath(node.left), findLongestPath(node.right)) + 1;
	}
	private static Node ConstructTree()
    {

        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(6);
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(7);
        Node n7 = new Node(5);

        n1.left = n2;
        n4.left = n3;
        n2.left = n4;
        n2.right = n5;
        n5.right = n6;
        n6.right = n7;
        
        return n1;
    }

}
