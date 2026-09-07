class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder();
        for (String s:strs){
            encoded.append(s.length()).append("#").append(s);
        }
        String e= new String(encoded);
        return e;
    }

    public List<String> decode(String str) {
        List<String> ans = new LinkedList<>();
        int i=0;
        while (i<str.length()){
            int j= str.indexOf('#',i);
            int length= Integer.parseInt(str.substring(i, j));
            i=j+1;
            ans.add(str.substring(i,i+length));
            i+=length;
        }
        return ans;
    }
}
