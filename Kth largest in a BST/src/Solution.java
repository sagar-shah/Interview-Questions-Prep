import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> vals = new ArrayList<Integer>();
        kthSmallest(root,vals);

        return vals.get(k-1);
    }
    public void kthSmallest(TreeNode root,  ArrayList<Integer> vals) {
    	if(root == null){
        	return;
        }
        kthSmallest(root.left,vals);
        vals.add(root.val);
        kthSmallest(root.right,vals);
    }

}
