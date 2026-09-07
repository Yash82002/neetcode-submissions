class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())
            return false;

ArrayList<Character> charList = new ArrayList<>();
for (int i=0;i<s.length();i++){

    charList.add(s. charAt(i));

}
        for (int i=0;i<t.length();i++){

            if (charList.contains(t. charAt(i)))
            charList.remove((Character) t. charAt(i));
        }

            if (charList.isEmpty())
            return true;
            return false;



    }
}
