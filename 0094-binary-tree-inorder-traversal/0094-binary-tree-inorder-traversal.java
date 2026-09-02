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
    

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        while(root != null){

            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }else{

                TreeNode ip = root.left;

                while (ip.right != null && ip.right != root) {
                    ip = ip.right;
                }

                if(ip.right == null){

                    ip.right  = root;
                    root = root.left;

                }else{
                    ip.right = null;
                    list.add(root.val);
                    root = root.right;

                }


            }

        }

        return list;
    }
}