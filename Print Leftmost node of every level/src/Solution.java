import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = ConstructTree();
		HashSet<Integer> h = new HashSet<Integer>();
		printLeftmost(root, 0, h);
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

        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        n7.left = n8;
        n8.right = n9;

        return n1;
    }
	public static void printLeftmost(Node node,int level, HashSet<Integer> hs)
	{
	      if(node == null)
	               return;
	      if(!hs.contains(level)){
	             System.out.println(node.data);
	              hs.add(level);
	       }
	      printLeftmost(node.left , level + 1 , hs);
	      printLeftmost(node.right, level + 1, hs);
	}

}
