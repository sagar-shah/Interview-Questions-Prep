import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = constructTree();
		
		inOrderIterative(root);
	}
	private static void inOrderIterative(Node root) {
		// TODO Auto-generated method stub
		Stack<Node> st = new Stack<Node>();
		
		while(root!=null){
			st.push(root);
			root = root.getLeft();
		}
		
		while(!st.empty()){
			Node n = st.pop();
			System.out.println(n.getData());
			Node right = n.getRight();
			while(right!=null){
				st.push(right);
				right = right.getLeft();
			}
		}
	}
	public static Node constructTree()
    {
            //         1
            //     2           3
            // 4       5   6       7


        Node n1 = new Node();
        n1.setData(1);
        Node n2 = new Node();
        n2.setData(2);
        Node n3 = new Node();
        n3.setData(3);
        Node n4 = new Node();
        n4.setData(4);
        Node n5 = new Node();
        n5.setData(5);
        Node n6 = new Node();
        n6.setData(6);
        Node n7 = new Node();
        n7.setData(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        
        return n1;
    }
}
