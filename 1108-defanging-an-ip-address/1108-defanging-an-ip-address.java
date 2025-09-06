class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sol=new StringBuilder();
        for(char c:address.toCharArray()){
            if(c=='.'){
                sol.append("[.]");

            }
            else
            sol.append(c);
        }
       

return sol.toString();
        
    }
}