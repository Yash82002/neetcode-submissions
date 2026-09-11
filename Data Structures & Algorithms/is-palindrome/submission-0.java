class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
       
        String clean = s.replaceAll("[^a-zA-Z0-9]", ""); 
        clean=clean.toLowerCase();
         int right=(clean.length())-1;
        while(left<right){
            if(clean.charAt(left)!=clean.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
}
