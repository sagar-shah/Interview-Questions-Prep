//https://leetcode.com/problems/path-sum-ii/#/description

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new LinkedList<>();
        List<List<Integer>> listOfPaths = new LinkedList<>();
        
        getPaths(path,listOfPaths,root,sum);
        
        return listOfPaths;
    }
    public static void getPaths(List<Integer> path,List<List<Integer>> listOfPaths,TreeNode node,int sum){
        if(node==null){
            path.add(null);
            return;
        }
        
        path.add(node.val);
        if(node.val==sum && node.left==null && node.right==null){
            List<Integer> clonedList = new LinkedList<>(path);
            listOfPaths.add(clonedList);
            return;
        }
        
        getPaths(path,listOfPaths,node.left,sum-node.val);
        path.remove(path.size()-1);
        getPaths(path,listOfPaths,node.right,sum-node.val);
        path.remove(path.size()-1);
        
        return;
    }
}