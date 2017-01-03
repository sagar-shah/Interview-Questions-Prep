import java.util.*;

public class Solution{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7};

		Node root = createBST(a,0,a.length-1);
		
		//print BST
		inOrderTraversal(root);
		
		ArrayList<ArrayList<Integer>> resultSets = getAllArrays(root);
		
		System.out.println("Result:");
		System.out.println(resultSets);
		System.out.println(resultSets.size()); // for a BST from 1..7, balanced, answer should be 80.
		
//		ArrayList<Integer> left = new ArrayList<Integer>();
//		left.add(1);
//		left.add(2);
//		
//		ArrayList<Integer> right = new ArrayList<Integer>();
//		right.add(3);
//		right.add(4);


	}
	private static ArrayList<ArrayList<Integer>> getAllArrays(Node node){

		if(node == null){
			return null;
		}
		
		if(node.getLeft() == null && node.getRight() == null){

			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(node.getData());
			ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
			r.add(al);

			return r;
		}

		ArrayList<ArrayList<Integer>> leftArraySet = getAllArrays(node.getLeft());
		ArrayList<ArrayList<Integer>> rightArraySet = getAllArrays(node.getRight());
		

		ArrayList<ArrayList<Integer>> interleavedResult = interleave(leftArraySet,rightArraySet);

		for(ArrayList<Integer> l : interleavedResult){
			l.add(0,node.getData());
		}
		
		return interleavedResult;
	}
	private static ArrayList<ArrayList<Integer>> interleave(ArrayList<ArrayList<Integer>> leftArraySet,ArrayList<ArrayList<Integer>> rightArraySet){

		if(leftArraySet==null && rightArraySet == null){
			ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
			return r;
		}
		if(leftArraySet==null){
			return rightArraySet;
		}
		if(rightArraySet==null){
			return leftArraySet;
		}

		ArrayList<ArrayList<Integer>> resultInterleavedSets = new ArrayList<ArrayList<Integer>>();

		for(int i = 0 ; i<leftArraySet.size() ; i++){
			for(int j=0 ; j < rightArraySet.size() ; j++){
				ArrayList<Integer> left = leftArraySet.get(i);
				ArrayList<Integer> right = rightArraySet.get(j);
				ArrayList<Integer> prefix = new ArrayList<Integer>();
				ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
				ArrayList<ArrayList<Integer>> resultTwoArraysInterleave = interleave(prefix,left,right,result);

				for(ArrayList<Integer> al : resultTwoArraysInterleave){
					resultInterleavedSets.add(al);
				}

			}
		}

		return resultInterleavedSets;

	}
	private static ArrayList<ArrayList<Integer>> interleave(ArrayList<Integer> prefix,ArrayList<Integer> left, ArrayList<Integer> right,ArrayList<ArrayList<Integer>> result){
		
		if(left.size() == 0){
			ArrayList<Integer> a1 = new ArrayList<Integer>(prefix);
			ArrayList<Integer> a2 = new ArrayList<Integer>(right);
			a1.addAll(a2);
			result.add(a1);

			return result;
		}
		if(right.size()==0){
			ArrayList<Integer> a1 = new ArrayList<Integer>(prefix);
			ArrayList<Integer> a2 = new ArrayList<Integer>(left);
			a1.addAll(a2);
			result.add(a1);

			return result;
		}

		prefix.add(left.get(0));
		Integer temp = left.remove(0);
		
		interleave(prefix,left,right,result);
				
		prefix.remove(prefix.size() - 1 );
		left.add(0,temp);
		
		prefix.add(right.get(0));
		Integer temp2 = right.remove(0);
		
		interleave(prefix,left,right,result);
		
		prefix.remove(prefix.size()-1);
		right.add(0,temp2);


		return result;


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
