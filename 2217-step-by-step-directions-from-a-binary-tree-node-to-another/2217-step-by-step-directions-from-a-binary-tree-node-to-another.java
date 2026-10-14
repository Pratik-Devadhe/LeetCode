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
    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        helper(root , startValue , s1);
        helper(root , destValue , s2);
        int  i = 0;

        while(i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i) ){
            i++;
        }

        StringBuilder ans = new StringBuilder();

        for(int j =i; j < s1.length(); j++){
            ans.append('U');
        }

        for(int j = i; j < s2.length(); j++){
            ans.append(s2.charAt(j));
        }
        
        return ans.toString();
        
    }

    private boolean helper(TreeNode root,  int val, StringBuilder sb){

        if(root == null) return false;

        if(root.val == val) return true;

        sb.append('L');

        if(helper(root.left , val , sb)){
            return true;
        }

        sb.deleteCharAt(sb.length() - 1);


        sb.append('R');
        
        if(helper(root.right , val , sb)){
            return true;
        }

        sb.deleteCharAt(sb.length() - 1);

        return false;
 
    }
}