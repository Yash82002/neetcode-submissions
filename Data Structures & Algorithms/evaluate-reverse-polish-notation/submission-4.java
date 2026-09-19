class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        int ans=0;
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&&!tokens[i].equals("*")&&!tokens[i].equals("-")&&!tokens[i].equals("/"))
            stack.push(Integer.parseInt(tokens[i]));
            else {if(tokens[i].equals("+")){
            
            ans= stack.pop()+stack.pop();
            stack.push(ans);
            }
            else if(tokens[i].equals("*")){
            
            ans= stack.pop()*stack.pop();
            stack.push(ans);
            }
             else if(tokens[i].equals("-")){
            int right = stack.pop();
            int left = stack.pop();
            ans= left-right;
            stack.push(ans);
            }
            else if(tokens[i].equals("/")){
            int right = stack.pop();
            int left = stack.pop();
            ans= left/right;
            stack.push(ans);
            }
            }
        }
        return stack.pop();
    }
}
