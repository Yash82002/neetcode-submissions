class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> num = new HashSet<>();
        int longest=0;
        for(int n: nums){
            num.add(n);
        }
        for(int n:num){
            
            if(!num.contains(n-1)){
              int current= n;
               int length=1;
            
            while(num.contains(current+1)){
                current++;
                length++;
            }
            longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
