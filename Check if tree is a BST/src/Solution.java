
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = constructTree();
		boolean isBST = checkIfBST(root,0,Integer.MAX_VALUE);
		if(isBST) System.out.println("BST");
		else System.out.println("Not BST");
	}
	private static boolean checkIfBST(Node node, int min, int max) {
		// TODO Auto-generated method stub
		if(node == null){
			return true;
		}
		if(node.data > min && node.data < max){
			return checkIfBST(node.left, min, node.data) && checkIfBST(node.right,node.data,max);
		}else{
			return false;
		}
	}
	public static Node constructTree()
    {

        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(6);
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(7);
        Node n7 = new Node(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        
        return n1;
    }
}
