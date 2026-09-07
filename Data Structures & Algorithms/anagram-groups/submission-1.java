class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,LinkedList<String>> map= new HashMap<>();
        for (String s:strs){
            char [] c= s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!map.containsKey(sorted))
            map.put(sorted, new LinkedList<String>());
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());

    }
}
