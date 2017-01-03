
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = ConstructTree();
		
		Node mirrorRoot = generateMirror(root);
		PreOrderTraversal(root);
		System.out.println();
		PreOrderTraversal(mirrorRoot);
	}
	public static Node generateMirror(Node node){
		
		if(node == null){
			return null;
		}
		Node n = new Node(node.data);
		n.left = generateMirror(node.right);
		n.right = generateMirror(node.left);
		
		return n;
	}
	private static void PreOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null){
			return;
		}
		System.out.print(node.data);
		PreOrderTraversal(node.left);
		PreOrderTraversal(node.right);
	}
	public static Node ConstructTree()
    {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        return n1;
    }

}
