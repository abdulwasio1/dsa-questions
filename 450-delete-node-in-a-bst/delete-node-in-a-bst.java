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
    int findMin(TreeNode root){
        if(root == null) return -1;
        TreeNode curr = root;
        int min = root.val;
        while(curr.left != null){
            min = curr.left.val;
            curr = curr.left;
        }
        return min;
    }
    public TreeNode deleteNode(TreeNode root, int target) {
        if (root == null) return root;
        if(target < root.val){
            root.left = deleteNode(root.left , target);
        }else if (target> root.val){
            root.right = deleteNode(root.right , target);
        }else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            root.val = findMin(root.right);

            root.right = deleteNode(root.right , root.val);
        }
        return root;
    }
}