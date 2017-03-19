public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if(left==-1 || right==-1) return false;
        else if (Math.abs(left-right)>1) return false;
        
        return true;
        
    }
    public static int getHeight(TreeNode n){
        if(n==null) return 0;
        
        int left = getHeight(n.left);
        if(left==-1) return -1;
        int right = getHeight(n.right);
        if(right==-1) return -1;
        
        if(Math.abs(left-right)>1) return -1;
        
        return (Math.max(left,right)) + 1;
    }
}