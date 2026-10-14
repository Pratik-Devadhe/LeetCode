/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    HashMap<TreeNode , TreeNode> parent = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        if(root == null) return new ArrayList<>();

        getParent(root , null);

        Queue<TreeNode> queue = new LinkedList<>();

        HashSet<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int dist = 0;

        while(!queue.isEmpty()){

            int size= queue.size();

            if(dist == k){

                List<Integer> ans = new ArrayList<>();

                for(TreeNode node : queue){
                    ans.add(node.val);
                }

                return ans;
            }

            for(int i =0; i < size; i++){

                TreeNode node = queue.poll();

                if(node.left != null && visited.add(node.left)){
                    queue.offer(node.left);
                }

                if(node.right != null && visited.add(node.right)){
                    queue.offer(node.right);
                }

                if(parent.get(node) != null && visited.add(parent.get(node))){
                    queue.offer(parent.get(node));
                }
            }
            dist++;
        }

    return new ArrayList<>();
        
    }

    public void getParent(TreeNode root, TreeNode parentNode){

        if(root == null) return;

        parent.put(root , parentNode);

        getParent(root.left , root);

        getParent(root.right , root);        
    }
}