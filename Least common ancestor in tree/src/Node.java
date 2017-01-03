public class Node{
    private int data;
    private Node left;
    private Node right;

    public int getData(){
        return data;
    }
    public void setData(int d){
        this.data = d;
    }
    public Node getLeft(){
        return left;
    }
    public void setLeft(Node l){
        this.left = l;
    }
    public Node getRight(){
        return right;
    }
    public void setRight(Node r){
        this.right = r;
    }
}