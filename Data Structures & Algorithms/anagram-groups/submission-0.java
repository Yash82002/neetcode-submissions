class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String, LinkedList<String>> ans = new HashMap<>();
       for (String s : strs){

        char [] c = s.toCharArray();
        Arrays.sort(c);
        String sorted= new String(c);
        if(!ans.containsKey(sorted)){
            ans.put(sorted,new LinkedList<String>());
        }
        ans.get(sorted).add(s);
       }

       return new LinkedList<>(ans.values());

    }
}
