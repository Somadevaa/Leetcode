class Solution {
      static  String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null||digits.length()==0)return result;
       solve(result,digits,0,new StringBuilder());
       return result; 
    }
    private void solve(List<String> result,String digits, int index,StringBuilder current){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        String let=keypad[digits.charAt(index)-'0'];
        for(char ch:let.toCharArray()){
            current.append(ch);
            solve(result,digits,index+1,current);
            current.deleteCharAt(current.length()-1);

        }

    }
}