class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        visit(nums , ans, new ArrayList<>() , 0);

        return ans;
        
    }

    private void visit(int[] nums , List<List<Integer>> ans , List<Integer> temp , int curr){

        if(curr == nums.length ){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(nums[curr]);

        visit(nums , ans , temp , curr + 1);

        temp.remove(temp.size() - 1);

        visit(nums, ans , temp , curr+ 1);

    }
}
