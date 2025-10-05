class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> result=new ArrayList<>();
    genz(result,"",n,0,0);
    return result;    

        
    }
    public void genz(List<String> result,String current,int n,int open ,int close){
        
        if(current.length()==n*2){
            result.add(current);
            return;

        }
        if(open<n){
            genz(result,current+"(",n,open+1,close);
        }
        if(open>close){
            genz(result,current+")",n,open,close+1);
        }
    }
}