class Solution {
    public boolean isValid(String s) {
        Stack <Character> ch = new Stack<>();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            ch.push(s.charAt(i));

            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(ch.isEmpty())
                return false;
                if(s.charAt(i)==')'&&ch.peek()=='(')
                ch.pop();
                else if(s.charAt(i)=='}'&&ch.peek()=='{')
                ch.pop();
                else if(s.charAt(i)==']'&&ch.peek()=='[')
                ch.pop();
                else return false;
            }
        }
        if(ch.isEmpty())
        return true;
        return false;
         
    }
}
