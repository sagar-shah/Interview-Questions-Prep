
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = ConstructTree();
		
		boolean result = isSymmetric(root);
		System.out.println(result);
	}
	private static boolean isSymmetric(Node root) {
		// TODO Auto-generated method stub
		
		return isSymmetric(root.left,root.right);
	}
	private static boolean isSymmetric(Node n1,Node n2) {
		// TODO Auto-generated method stub
		if(n1 == null && n2==null)
			return true;
		if(n1==null && n2!=null)
			return false;
		if(n1!=null && n2==null)
			return false;
		
		return isSymmetric(n1.left,n2.right) && isSymmetric(n1.right, n2.left);
	}
	public static Node ConstructTree()
    {

        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(6);
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(7);
        Node n7 = new Node(5);

//        n1.left = n2;
        n1.right = n3;
//        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
//        n3.right = n7;
        
        return n1;
    }

}
