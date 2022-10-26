/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sum;

    public int sumNumbers(TreeNode root) {

        helper(root,0);
        return sum;
    }
        
    public void helper(TreeNode root,int currntSum)
    {
        if(root.left==null && root.right==null)
        {
            sum += currntSum*10+root.val;
        }

        if(root.left!=null)
            helper(root.left,currntSum*10+root.val);
        if(root.right!=null)
            helper(root.right,currntSum*10+root.val);    
    }
}
