class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(char c:s1.toCharArray()){
            if(c=='('||c=='{'||c=='[')
               s.push(c);
            else{
                if(s.isEmpty())return false;
                char top=s.pop();
                if((c==')' && top !='(')||
                (c=='}' && top!= '{')||
                (c==']' && top!='[')){
                    return false;
                }
            }

        } return s.isEmpty();
        
    }
}