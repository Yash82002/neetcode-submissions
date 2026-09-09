class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb= sb.append(s.length()).append('#').append(s);
        }
        String encode= new String(sb);
        return encode;

    }

    public List<String> decode(String str) {
        ArrayList<String> decode= new ArrayList<>();
        int i=0;
       while(i<str.length()){

        int j = str.indexOf('#',i);
        int length = Integer.parseInt(str.substring(i,j));
        i=j+1;
        decode.add(str.substring(i,i+length));
        i+=length;

       }
       return decode;

    }
}
