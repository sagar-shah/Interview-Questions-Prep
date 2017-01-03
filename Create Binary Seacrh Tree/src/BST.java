public class BST{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8,9,10};

		Node root = createBST(a,0,a.length-1);

		inOrderTraversal(root);
	}
	public static void inOrderTraversal(Node n){
		if(n==null)
			return;
		inOrderTraversal(n.getLeft());
		System.out.println(n.getData());
		inOrderTraversal(n.getRight());
	}
	public static Node createBST(int[] data, int i, int j){
		if(i<=j){

			int mid = i +  (j - i)/2; //overflow check

			Node n = new Node();
			n.setData(data[mid]);
			n.setLeft(createBST(data,i,mid-1));
			n.setRight(createBST(data,mid+1,j));

			return n;
		}
		return null;
	}
}