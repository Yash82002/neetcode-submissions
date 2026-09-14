class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> ans = new HashSet<>();
        for(int n:nums){
            ans.add(n);
        }
        if(ans.size()==nums.length)
        return false;
        return true;
    }
}