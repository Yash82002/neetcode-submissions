class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int e: nums){
        
            map.put(e,map.getOrDefault((e),(0))+1);
        }
        int n= nums.length;
        ArrayList <Integer>[] list = new ArrayList[n+1];
        int[] ans = new int[k];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(list[freq]==null)
            list[freq]= new ArrayList<>();
            list[freq].add(key);

        }
                    int count=0;

        for(int i=n;i>0;i--){
            if(list[i]!=null){
            for(int x: list[i]){
                ans[count]=x;
                count++;
                
            }
            
            }
            if (count==k)
                break;
        }
        return ans;
    }
}
