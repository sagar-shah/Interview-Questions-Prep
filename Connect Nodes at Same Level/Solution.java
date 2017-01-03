import  java.util.*;

class Solution{
    public static void main(String args[]){
        Node root = constructTree();

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);

        while( q.size() > 1){
            Node n = q.remove();
            if (n!=null){
              n.nextRight = q.peek();  
              System.out.println(n.data + "   " + n.nextRight);
            } 
            else{
                q.add(null);
                continue;
            }
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
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
