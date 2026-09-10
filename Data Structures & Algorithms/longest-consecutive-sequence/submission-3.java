class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set= new HashSet<>();
        int ans=0;
        for(int n: nums){
            set.add(n);
        }
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1)){
                longest=1;
                while(set.contains(n+1)){
            longest++;
            n++;
            
        }

            }

        
                            ans=Math.max(ans,longest);

        }
        return ans;
    }

}
