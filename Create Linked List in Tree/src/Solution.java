import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = constructTree();

		// inOrderTraversal(root);

        ArrayList<LinkedList<Node>> al = BFSCreate(root);

        for(LinkedList<Node> l : al){
            for (Node n : l){
                System.out.print(n.getData() + " ");
            }
            System.out.println();
        }
        
        HashMap<Integer,LinkedList<Node>> hm = DFSCreate(root);

        for(Map.Entry<Integer,LinkedList<Node>> entry : hm.entrySet()){
            LinkedList<Node> l = entry.getValue();
            for(Node n : l){
                
                    System.out.print(n.getData() + " ");
            }
            System.out.println();
        }
        
	}
	public static HashMap<Integer,LinkedList<Node>> DFSCreate(Node n){
        HashMap<Integer,LinkedList<Node>> hm = new HashMap<Integer,LinkedList<Node>>();

        DFS(n,hm,0);

        return hm;


    }
    private static HashMap<Integer,LinkedList<Node>> DFS(Node n,HashMap<Integer,LinkedList<Node>> hm,int depth){
        if(n == null){
            return hm;
        }

        if(hm.containsKey(depth)){
            LinkedList<Node> l = hm.get(depth);
            l.add(n);
        }
        else{
            hm.put(depth,new LinkedList<Node>());
            LinkedList<Node> l = hm.get(depth);
            l.add(n);
        }
        DFS(n.getLeft(),hm,depth+1);
        DFS(n.getRight(),hm,depth+1);

        return hm;
    }
    public static ArrayList<LinkedList<Node>> BFSCreate(Node n){
        //create al of size depth d
        ArrayList<LinkedList<Node>> al = new ArrayList<LinkedList<Node>>();
        
        // For each depth level in BFS start appending the lists
        Queue<Node> q = new LinkedList<Node>();
        q.add(n);
        q.add(null);

        al.add(new LinkedList<Node>());

        while(q.size()>1){
            Node temp = q.remove();
            if(temp!=null){
                LinkedList<Node> l = al.get(al.size()-1);
                l.add(temp);


            }else{

                q.add(null);
                al.add(new LinkedList<Node>());
                continue;
            }
            if(temp.getLeft() != null) q.add(temp.getLeft());
            if(temp.getRight() != null) q.add(temp.getRight());

        }

        return al ;

    }
	public static void inOrderTraversal(Node n){
		if(n==null)
			return;
		inOrderTraversal(n.getLeft());
		System.out.println(n.getData());
		inOrderTraversal(n.getRight());
	}
	public static Node constructTree()
    {

        Node n1 = new Node();
        n1.setData(4);
        Node n2 = new Node();
        n2.setData(2);
        Node n3 = new Node();
        n3.setData(6);
        Node n4 = new Node();
        n4.setData(1);
        Node n5 = new Node();
        n5.setData(3);
        Node n6 = new Node();
        n6.setData(7);
        Node n7 = new Node();
        n7.setData(5);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        
        return n1;
    }
}
