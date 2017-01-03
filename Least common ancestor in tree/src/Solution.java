
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = constructTree();
		
        Node n1 = new Node();
        n1.setData(2);
        Node n2 = new Node();
        n2.setData(7);
        // I will be checking by node value here as the nodes that are passed are new nodes and not the nodes of the tree
		Node n = getLeastCommonAncestor(root,n1,n2);
		System.out.println(n.getData());
	}
    public static Node getLeastCommonAncestor(Node root,Node n1,Node n2){
        if (root == null){
            return null;
        }

        if (root.getData() == n1.getData() || root.getData() == n2.getData())
            return root;

        //check whether n1 is to left of root
        Node lcaOnLeft = getLeastCommonAncestor(root.getLeft(),n1,n2);
        if (lcaOnLeft != null && lcaOnLeft.getData() != n1.getData() && lcaOnLeft.getData() != n2.getData())
            return lcaOnLeft;

        //check whether n2 is to left
        Node lcaOnRight = getLeastCommonAncestor(root.getRight(),n1,n2);
        if (lcaOnRight!= null && lcaOnRight.getData() != n1.getData() && lcaOnRight.getData() != n2.getData())
            return lcaOnRight; 

        //if both on same side - check again on that side
        if (lcaOnLeft == null && lcaOnRight == null)
            return null;

        if (lcaOnLeft == null && lcaOnRight != null)
            return getLeastCommonAncestor(lcaOnRight,n1,n2);

        if (lcaOnLeft != null && lcaOnRight == null)
            return getLeastCommonAncestor(lcaOnLeft,n1,n2);

        System.out.println("Found " + Integer.toString(root.getData()));
        return root;
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
